// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableIdentityProviderAuthnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableIdentityProviderAuthnResponseBody body;

    public static DisableIdentityProviderAuthnResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableIdentityProviderAuthnResponse self = new DisableIdentityProviderAuthnResponse();
        return TeaModel.build(map, self);
    }

    public DisableIdentityProviderAuthnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableIdentityProviderAuthnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableIdentityProviderAuthnResponse setBody(DisableIdentityProviderAuthnResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableIdentityProviderAuthnResponseBody getBody() {
        return this.body;
    }

}
