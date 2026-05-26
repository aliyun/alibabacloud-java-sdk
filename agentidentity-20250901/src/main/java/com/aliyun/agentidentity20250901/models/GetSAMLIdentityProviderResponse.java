// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSAMLIdentityProviderResponseBody body;

    public static GetSAMLIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLIdentityProviderResponse self = new GetSAMLIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetSAMLIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSAMLIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSAMLIdentityProviderResponse setBody(GetSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
