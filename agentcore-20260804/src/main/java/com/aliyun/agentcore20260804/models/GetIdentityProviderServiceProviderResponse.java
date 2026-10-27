// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderServiceProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderServiceProviderResponseBody body;

    public static GetIdentityProviderServiceProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderServiceProviderResponse self = new GetIdentityProviderServiceProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderServiceProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderServiceProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderServiceProviderResponse setBody(GetIdentityProviderServiceProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderServiceProviderResponseBody getBody() {
        return this.body;
    }

}
