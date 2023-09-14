// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRegistrationPoliciesResponseBody body;

    public static ListRegistrationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesResponse self = new ListRegistrationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegistrationPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegistrationPoliciesResponse setBody(ListRegistrationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegistrationPoliciesResponseBody getBody() {
        return this.body;
    }

}
