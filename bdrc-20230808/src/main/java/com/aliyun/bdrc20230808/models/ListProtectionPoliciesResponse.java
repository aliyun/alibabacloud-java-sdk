// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProtectionPoliciesResponseBody body;

    public static ListProtectionPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPoliciesResponse self = new ListProtectionPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListProtectionPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProtectionPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProtectionPoliciesResponse setBody(ListProtectionPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProtectionPoliciesResponseBody getBody() {
        return this.body;
    }

}
