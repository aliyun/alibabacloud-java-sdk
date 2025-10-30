// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCustomPrivacyPoliciesForBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomPrivacyPoliciesForBrandResponseBody body;

    public static ListCustomPrivacyPoliciesForBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPrivacyPoliciesForBrandResponse self = new ListCustomPrivacyPoliciesForBrandResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomPrivacyPoliciesForBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomPrivacyPoliciesForBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomPrivacyPoliciesForBrandResponse setBody(ListCustomPrivacyPoliciesForBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomPrivacyPoliciesForBrandResponseBody getBody() {
        return this.body;
    }

}
