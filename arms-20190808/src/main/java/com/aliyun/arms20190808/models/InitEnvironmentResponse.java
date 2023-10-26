// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InitEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitEnvironmentResponseBody body;

    public static InitEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResponse self = new InitEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitEnvironmentResponse setBody(InitEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public InitEnvironmentResponseBody getBody() {
        return this.body;
    }

}
