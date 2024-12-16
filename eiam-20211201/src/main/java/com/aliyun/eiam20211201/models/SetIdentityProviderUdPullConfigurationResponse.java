// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderUdPullConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdentityProviderUdPullConfigurationResponseBody body;

    public static SetIdentityProviderUdPullConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderUdPullConfigurationResponse self = new SetIdentityProviderUdPullConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderUdPullConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdentityProviderUdPullConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdentityProviderUdPullConfigurationResponse setBody(SetIdentityProviderUdPullConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdentityProviderUdPullConfigurationResponseBody getBody() {
        return this.body;
    }

}
