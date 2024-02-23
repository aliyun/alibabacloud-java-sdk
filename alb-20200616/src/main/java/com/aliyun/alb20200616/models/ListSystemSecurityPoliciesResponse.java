// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemSecurityPoliciesResponseBody body;

    public static ListSystemSecurityPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPoliciesResponse self = new ListSystemSecurityPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemSecurityPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemSecurityPoliciesResponse setBody(ListSystemSecurityPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemSecurityPoliciesResponseBody getBody() {
        return this.body;
    }

}
