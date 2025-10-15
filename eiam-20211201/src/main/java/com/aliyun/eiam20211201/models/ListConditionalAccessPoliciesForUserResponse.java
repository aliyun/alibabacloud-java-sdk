// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConditionalAccessPoliciesForUserResponseBody body;

    public static ListConditionalAccessPoliciesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForUserResponse self = new ListConditionalAccessPoliciesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConditionalAccessPoliciesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConditionalAccessPoliciesForUserResponse setBody(ListConditionalAccessPoliciesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConditionalAccessPoliciesForUserResponseBody getBody() {
        return this.body;
    }

}
