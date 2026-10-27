// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSCIMResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderSCIMResponseBody body;

    public static GetIdentityProviderSCIMResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSCIMResponse self = new GetIdentityProviderSCIMResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSCIMResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderSCIMResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderSCIMResponse setBody(GetIdentityProviderSCIMResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderSCIMResponseBody getBody() {
        return this.body;
    }

}
