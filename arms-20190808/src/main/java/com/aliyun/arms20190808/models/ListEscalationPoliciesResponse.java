// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEscalationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEscalationPoliciesResponseBody body;

    public static ListEscalationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPoliciesResponse self = new ListEscalationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListEscalationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEscalationPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEscalationPoliciesResponse setBody(ListEscalationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEscalationPoliciesResponseBody getBody() {
        return this.body;
    }

}
