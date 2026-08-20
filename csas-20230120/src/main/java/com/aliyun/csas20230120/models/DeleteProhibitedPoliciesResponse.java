// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProhibitedPoliciesResponseBody body;

    public static DeleteProhibitedPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedPoliciesResponse self = new DeleteProhibitedPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProhibitedPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProhibitedPoliciesResponse setBody(DeleteProhibitedPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProhibitedPoliciesResponseBody getBody() {
        return this.body;
    }

}
