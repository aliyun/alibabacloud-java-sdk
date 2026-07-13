// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class BindIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindIdentityProviderResponseBody body;

    public static BindIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        BindIdentityProviderResponse self = new BindIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public BindIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindIdentityProviderResponse setBody(BindIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public BindIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
