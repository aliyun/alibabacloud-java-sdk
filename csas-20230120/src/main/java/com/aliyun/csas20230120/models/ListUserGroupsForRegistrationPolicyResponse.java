// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForRegistrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserGroupsForRegistrationPolicyResponseBody body;

    public static ListUserGroupsForRegistrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForRegistrationPolicyResponse self = new ListUserGroupsForRegistrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForRegistrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsForRegistrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGroupsForRegistrationPolicyResponse setBody(ListUserGroupsForRegistrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsForRegistrationPolicyResponseBody getBody() {
        return this.body;
    }

}
