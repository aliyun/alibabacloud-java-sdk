// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderUdPushConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdentityProviderUdPushConfigurationResponseBody body;

    public static SetIdentityProviderUdPushConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderUdPushConfigurationResponse self = new SetIdentityProviderUdPushConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderUdPushConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdentityProviderUdPushConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdentityProviderUdPushConfigurationResponse setBody(SetIdentityProviderUdPushConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdentityProviderUdPushConfigurationResponseBody getBody() {
        return this.body;
    }

}
