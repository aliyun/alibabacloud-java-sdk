// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveUserLoginPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserLoginPoliciesResponseBody body;

    public static RemoveUserLoginPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserLoginPoliciesResponse self = new RemoveUserLoginPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserLoginPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserLoginPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserLoginPoliciesResponse setBody(RemoveUserLoginPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserLoginPoliciesResponseBody getBody() {
        return this.body;
    }

}
