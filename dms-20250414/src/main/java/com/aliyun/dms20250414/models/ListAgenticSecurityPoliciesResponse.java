// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSecurityPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticSecurityPoliciesResponseBody body;

    public static ListAgenticSecurityPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSecurityPoliciesResponse self = new ListAgenticSecurityPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticSecurityPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticSecurityPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticSecurityPoliciesResponse setBody(ListAgenticSecurityPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticSecurityPoliciesResponseBody getBody() {
        return this.body;
    }

}
