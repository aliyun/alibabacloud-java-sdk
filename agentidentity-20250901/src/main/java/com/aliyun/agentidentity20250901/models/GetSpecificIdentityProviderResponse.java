// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSpecificIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpecificIdentityProviderResponseBody body;

    public static GetSpecificIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificIdentityProviderResponse self = new GetSpecificIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetSpecificIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpecificIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpecificIdentityProviderResponse setBody(GetSpecificIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpecificIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
