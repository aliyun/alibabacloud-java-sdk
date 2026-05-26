// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSAMLIdentityProviderResponseBody body;

    public static SetSAMLIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSAMLIdentityProviderResponse self = new SetSAMLIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public SetSAMLIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSAMLIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSAMLIdentityProviderResponse setBody(SetSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
