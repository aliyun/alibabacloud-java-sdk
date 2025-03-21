// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConditionalAccessPoliciesResponseBody body;

    public static ListConditionalAccessPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesResponse self = new ListConditionalAccessPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConditionalAccessPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConditionalAccessPoliciesResponse setBody(ListConditionalAccessPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConditionalAccessPoliciesResponseBody getBody() {
        return this.body;
    }

}
