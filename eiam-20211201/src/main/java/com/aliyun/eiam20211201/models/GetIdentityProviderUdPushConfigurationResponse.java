// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPushConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderUdPushConfigurationResponseBody body;

    public static GetIdentityProviderUdPushConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderUdPushConfigurationResponse self = new GetIdentityProviderUdPushConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderUdPushConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderUdPushConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderUdPushConfigurationResponse setBody(GetIdentityProviderUdPushConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderUdPushConfigurationResponseBody getBody() {
        return this.body;
    }

}
