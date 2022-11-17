// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestBoyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestBoyResponseBody body;

    public static TestBoyResponse build(java.util.Map<String, ?> map) throws Exception {
        TestBoyResponse self = new TestBoyResponse();
        return TeaModel.build(map, self);
    }

    public TestBoyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestBoyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestBoyResponse setBody(TestBoyResponseBody body) {
        this.body = body;
        return this;
    }
    public TestBoyResponseBody getBody() {
        return this.body;
    }

}
