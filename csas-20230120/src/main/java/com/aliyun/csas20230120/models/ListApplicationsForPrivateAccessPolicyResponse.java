// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForPrivateAccessPolicyResponseBody body;

    public static ListApplicationsForPrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessPolicyResponse self = new ListApplicationsForPrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForPrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForPrivateAccessPolicyResponse setBody(ListApplicationsForPrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForPrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
