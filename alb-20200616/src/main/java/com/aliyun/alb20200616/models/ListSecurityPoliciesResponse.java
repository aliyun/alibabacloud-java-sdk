// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityPoliciesResponseBody body;

    public static ListSecurityPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPoliciesResponse self = new ListSecurityPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityPoliciesResponse setBody(ListSecurityPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityPoliciesResponseBody getBody() {
        return this.body;
    }

}
