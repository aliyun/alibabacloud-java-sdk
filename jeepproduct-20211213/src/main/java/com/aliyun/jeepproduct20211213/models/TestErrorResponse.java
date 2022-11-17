// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestErrorResponseBody body;

    public static TestErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        TestErrorResponse self = new TestErrorResponse();
        return TeaModel.build(map, self);
    }

    public TestErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestErrorResponse setBody(TestErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public TestErrorResponseBody getBody() {
        return this.body;
    }

}
