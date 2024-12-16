// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPullConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderUdPullConfigurationResponseBody body;

    public static GetIdentityProviderUdPullConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderUdPullConfigurationResponse self = new GetIdentityProviderUdPullConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderUdPullConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderUdPullConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderUdPullConfigurationResponse setBody(GetIdentityProviderUdPullConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderUdPullConfigurationResponseBody getBody() {
        return this.body;
    }

}
