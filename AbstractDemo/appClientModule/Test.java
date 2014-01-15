public class Test{
    public void run(){
        //ADemo ad = new ADemo();
        
        Child child = new Child();
        child.method1();
        child.method2();
        this.iDemo.method3();
        
        IChild iChild = new IChild();
        iChild.method3();
    }
    
    private IDemo iDemo = new IDemo(){
        @Override
        public void method3(){
            System.out.print("this is method3\n");
        }
    };
    
    class IChild implements IDemo{
        @Override
        public void method3(){
            System.out.print("this is method3 from another class\n");
        }
    }
    //正确做法
    class Child extends ADemo{
        //TO-DO: we should implement the abstract method
        @Override 
        public void method2(){
            System.out.print("this is the abstract method\n");
        }
    }
}