// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestByondResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestByondResponseBody body;

    public static TestByondResponse build(java.util.Map<String, ?> map) throws Exception {
        TestByondResponse self = new TestByondResponse();
        return TeaModel.build(map, self);
    }

    public TestByondResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestByondResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestByondResponse setBody(TestByondResponseBody body) {
        this.body = body;
        return this;
    }
    public TestByondResponseBody getBody() {
        return this.body;
    }

}
