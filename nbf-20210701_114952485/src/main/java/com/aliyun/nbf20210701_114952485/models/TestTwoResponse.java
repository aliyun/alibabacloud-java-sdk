// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestTwoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestTwoResponseBody body;

    public static TestTwoResponse build(java.util.Map<String, ?> map) throws Exception {
        TestTwoResponse self = new TestTwoResponse();
        return TeaModel.build(map, self);
    }

    public TestTwoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestTwoResponse setBody(TestTwoResponseBody body) {
        this.body = body;
        return this;
    }
    public TestTwoResponseBody getBody() {
        return this.body;
    }

}
