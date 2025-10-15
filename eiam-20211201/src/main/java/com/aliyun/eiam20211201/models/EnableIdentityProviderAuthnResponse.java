// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableIdentityProviderAuthnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableIdentityProviderAuthnResponseBody body;

    public static EnableIdentityProviderAuthnResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIdentityProviderAuthnResponse self = new EnableIdentityProviderAuthnResponse();
        return TeaModel.build(map, self);
    }

    public EnableIdentityProviderAuthnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIdentityProviderAuthnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableIdentityProviderAuthnResponse setBody(EnableIdentityProviderAuthnResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIdentityProviderAuthnResponseBody getBody() {
        return this.body;
    }

}
