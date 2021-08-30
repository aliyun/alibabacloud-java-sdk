// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestOneResponseBody body;

    public static TestOneResponse build(java.util.Map<String, ?> map) throws Exception {
        TestOneResponse self = new TestOneResponse();
        return TeaModel.build(map, self);
    }

    public TestOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestOneResponse setBody(TestOneResponseBody body) {
        this.body = body;
        return this;
    }
    public TestOneResponseBody getBody() {
        return this.body;
    }

}
