// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSpecificIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSpecificIdentityProviderResponseBody body;

    public static SetSpecificIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSpecificIdentityProviderResponse self = new SetSpecificIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public SetSpecificIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSpecificIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSpecificIdentityProviderResponse setBody(SetSpecificIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSpecificIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
