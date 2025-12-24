// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableIdentityProviderAdvancedAbilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableIdentityProviderAdvancedAbilityResponseBody body;

    public static EnableIdentityProviderAdvancedAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIdentityProviderAdvancedAbilityResponse self = new EnableIdentityProviderAdvancedAbilityResponse();
        return TeaModel.build(map, self);
    }

    public EnableIdentityProviderAdvancedAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIdentityProviderAdvancedAbilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableIdentityProviderAdvancedAbilityResponse setBody(EnableIdentityProviderAdvancedAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIdentityProviderAdvancedAbilityResponseBody getBody() {
        return this.body;
    }

}
