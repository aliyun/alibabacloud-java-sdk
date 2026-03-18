// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateJwtAuthenticationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateJwtAuthenticationTokenResponseBody body;

    public static GenerateJwtAuthenticationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateJwtAuthenticationTokenResponse self = new GenerateJwtAuthenticationTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateJwtAuthenticationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateJwtAuthenticationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateJwtAuthenticationTokenResponse setBody(GenerateJwtAuthenticationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateJwtAuthenticationTokenResponseBody getBody() {
        return this.body;
    }

}
