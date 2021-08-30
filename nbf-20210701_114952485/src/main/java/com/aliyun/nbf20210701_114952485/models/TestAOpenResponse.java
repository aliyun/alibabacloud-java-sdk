// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestAOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestAOpenResponseBody body;

    public static TestAOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAOpenResponse self = new TestAOpenResponse();
        return TeaModel.build(map, self);
    }

    public TestAOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestAOpenResponse setBody(TestAOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public TestAOpenResponseBody getBody() {
        return this.body;
    }

}
