// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderResponseBody body;

    public static GetIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderResponse self = new GetIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderResponse setBody(GetIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
