// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConditionalAccessPoliciesForApplicationResponseBody body;

    public static ListConditionalAccessPoliciesForApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForApplicationResponse self = new ListConditionalAccessPoliciesForApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConditionalAccessPoliciesForApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConditionalAccessPoliciesForApplicationResponse setBody(ListConditionalAccessPoliciesForApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConditionalAccessPoliciesForApplicationResponseBody getBody() {
        return this.body;
    }

}
