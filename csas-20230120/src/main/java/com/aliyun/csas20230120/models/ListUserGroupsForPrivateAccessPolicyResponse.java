// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForPrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserGroupsForPrivateAccessPolicyResponseBody body;

    public static ListUserGroupsForPrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForPrivateAccessPolicyResponse self = new ListUserGroupsForPrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForPrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsForPrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGroupsForPrivateAccessPolicyResponse setBody(ListUserGroupsForPrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsForPrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
