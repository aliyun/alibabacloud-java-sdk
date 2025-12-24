// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableIdentityProviderAdvancedAbilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableIdentityProviderAdvancedAbilityResponseBody body;

    public static DisableIdentityProviderAdvancedAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableIdentityProviderAdvancedAbilityResponse self = new DisableIdentityProviderAdvancedAbilityResponse();
        return TeaModel.build(map, self);
    }

    public DisableIdentityProviderAdvancedAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableIdentityProviderAdvancedAbilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableIdentityProviderAdvancedAbilityResponse setBody(DisableIdentityProviderAdvancedAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableIdentityProviderAdvancedAbilityResponseBody getBody() {
        return this.body;
    }

}
