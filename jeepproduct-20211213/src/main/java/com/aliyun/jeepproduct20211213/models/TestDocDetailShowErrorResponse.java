// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestDocDetailShowErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestDocDetailShowErrorResponseBody body;

    public static TestDocDetailShowErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        TestDocDetailShowErrorResponse self = new TestDocDetailShowErrorResponse();
        return TeaModel.build(map, self);
    }

    public TestDocDetailShowErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestDocDetailShowErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestDocDetailShowErrorResponse setBody(TestDocDetailShowErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public TestDocDetailShowErrorResponseBody getBody() {
        return this.body;
    }

}
