// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderAuthnConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdentityProviderAuthnConfigurationResponseBody body;

    public static SetIdentityProviderAuthnConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderAuthnConfigurationResponse self = new SetIdentityProviderAuthnConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderAuthnConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdentityProviderAuthnConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdentityProviderAuthnConfigurationResponse setBody(SetIdentityProviderAuthnConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdentityProviderAuthnConfigurationResponseBody getBody() {
        return this.body;
    }

}
