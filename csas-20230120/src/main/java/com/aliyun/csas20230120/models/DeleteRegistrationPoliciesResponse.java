// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteRegistrationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegistrationPoliciesResponseBody body;

    public static DeleteRegistrationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrationPoliciesResponse self = new DeleteRegistrationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistrationPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegistrationPoliciesResponse setBody(DeleteRegistrationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistrationPoliciesResponseBody getBody() {
        return this.body;
    }

}
