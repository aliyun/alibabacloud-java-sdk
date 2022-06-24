// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class TestProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestProxyResponseBody body;

    public static TestProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        TestProxyResponse self = new TestProxyResponse();
        return TeaModel.build(map, self);
    }

    public TestProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestProxyResponse setBody(TestProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public TestProxyResponseBody getBody() {
        return this.body;
    }

}
