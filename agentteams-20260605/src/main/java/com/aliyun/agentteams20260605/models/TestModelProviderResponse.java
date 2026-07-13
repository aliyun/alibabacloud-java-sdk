// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class TestModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestModelProviderResponseBody body;

    public static TestModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        TestModelProviderResponse self = new TestModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public TestModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestModelProviderResponse setBody(TestModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public TestModelProviderResponseBody getBody() {
        return this.body;
    }

}
