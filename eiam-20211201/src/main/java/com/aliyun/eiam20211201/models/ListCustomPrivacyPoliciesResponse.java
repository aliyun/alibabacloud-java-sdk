// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCustomPrivacyPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomPrivacyPoliciesResponseBody body;

    public static ListCustomPrivacyPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPrivacyPoliciesResponse self = new ListCustomPrivacyPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomPrivacyPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomPrivacyPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomPrivacyPoliciesResponse setBody(ListCustomPrivacyPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomPrivacyPoliciesResponseBody getBody() {
        return this.body;
    }

}
