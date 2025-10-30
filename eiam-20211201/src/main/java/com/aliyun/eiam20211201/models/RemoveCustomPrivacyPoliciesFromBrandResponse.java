// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveCustomPrivacyPoliciesFromBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveCustomPrivacyPoliciesFromBrandResponseBody body;

    public static RemoveCustomPrivacyPoliciesFromBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCustomPrivacyPoliciesFromBrandResponse self = new RemoveCustomPrivacyPoliciesFromBrandResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCustomPrivacyPoliciesFromBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCustomPrivacyPoliciesFromBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveCustomPrivacyPoliciesFromBrandResponse setBody(RemoveCustomPrivacyPoliciesFromBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCustomPrivacyPoliciesFromBrandResponseBody getBody() {
        return this.body;
    }

}
