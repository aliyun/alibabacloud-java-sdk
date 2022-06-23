// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class TestProResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestProResponseBody body;

    public static TestProResponse build(java.util.Map<String, ?> map) throws Exception {
        TestProResponse self = new TestProResponse();
        return TeaModel.build(map, self);
    }

    public TestProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestProResponse setBody(TestProResponseBody body) {
        this.body = body;
        return this;
    }
    public TestProResponseBody getBody() {
        return this.body;
    }

}
