// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserPrivateAccessPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPrivateAccessPoliciesResponseBody body;

    public static ListUserPrivateAccessPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPrivateAccessPoliciesResponse self = new ListUserPrivateAccessPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPrivateAccessPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPrivateAccessPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPrivateAccessPoliciesResponse setBody(ListUserPrivateAccessPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPrivateAccessPoliciesResponseBody getBody() {
        return this.body;
    }

}
