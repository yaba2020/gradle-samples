package com.gradledemo;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public class SayHelloTest {

    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
        System.out.println("done some changes, done local changes to push ");
        System.out.println("done more changes");
    }

}
