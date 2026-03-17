// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenByAuthorizationServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTokenByAuthorizationServerResponseBody body;

    public static GenerateTokenByAuthorizationServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenByAuthorizationServerResponse self = new GenerateTokenByAuthorizationServerResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTokenByAuthorizationServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTokenByAuthorizationServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTokenByAuthorizationServerResponse setBody(GenerateTokenByAuthorizationServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTokenByAuthorizationServerResponseBody getBody() {
        return this.body;
    }

}
