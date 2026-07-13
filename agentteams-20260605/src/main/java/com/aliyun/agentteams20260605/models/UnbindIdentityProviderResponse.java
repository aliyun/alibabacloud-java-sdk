// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UnbindIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindIdentityProviderResponseBody body;

    public static UnbindIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindIdentityProviderResponse self = new UnbindIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public UnbindIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindIdentityProviderResponse setBody(UnbindIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
