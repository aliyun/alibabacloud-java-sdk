// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAutoRepairPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoRepairPoliciesResponseBody body;

    public static ListAutoRepairPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoRepairPoliciesResponse self = new ListAutoRepairPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoRepairPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoRepairPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoRepairPoliciesResponse setBody(ListAutoRepairPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoRepairPoliciesResponseBody getBody() {
        return this.body;
    }

}
