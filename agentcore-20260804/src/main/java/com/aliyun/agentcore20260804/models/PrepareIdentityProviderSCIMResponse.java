// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrepareIdentityProviderSCIMResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrepareIdentityProviderSCIMResponseBody body;

    public static PrepareIdentityProviderSCIMResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepareIdentityProviderSCIMResponse self = new PrepareIdentityProviderSCIMResponse();
        return TeaModel.build(map, self);
    }

    public PrepareIdentityProviderSCIMResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepareIdentityProviderSCIMResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepareIdentityProviderSCIMResponse setBody(PrepareIdentityProviderSCIMResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepareIdentityProviderSCIMResponseBody getBody() {
        return this.body;
    }

}
