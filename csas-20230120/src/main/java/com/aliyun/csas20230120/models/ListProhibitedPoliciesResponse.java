// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProhibitedPoliciesResponseBody body;

    public static ListProhibitedPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedPoliciesResponse self = new ListProhibitedPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListProhibitedPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProhibitedPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProhibitedPoliciesResponse setBody(ListProhibitedPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProhibitedPoliciesResponseBody getBody() {
        return this.body;
    }

}
