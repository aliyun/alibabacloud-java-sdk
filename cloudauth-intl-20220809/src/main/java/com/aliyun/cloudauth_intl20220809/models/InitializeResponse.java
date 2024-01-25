// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeResponseBody body;

    public static InitializeResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeResponse self = new InitializeResponse();
        return TeaModel.build(map, self);
    }

    public InitializeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeResponse setBody(InitializeResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeResponseBody getBody() {
        return this.body;
    }

}
