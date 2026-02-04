// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderAdvancedConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderAdvancedConfigurationResponseBody body;

    public static GetIdentityProviderAdvancedConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderAdvancedConfigurationResponse self = new GetIdentityProviderAdvancedConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderAdvancedConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderAdvancedConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderAdvancedConfigurationResponse setBody(GetIdentityProviderAdvancedConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderAdvancedConfigurationResponseBody getBody() {
        return this.body;
    }

}
