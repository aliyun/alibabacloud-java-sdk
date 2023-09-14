// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRegistrationPoliciesForUserGroupResponseBody body;

    public static ListRegistrationPoliciesForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesForUserGroupResponse self = new ListRegistrationPoliciesForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegistrationPoliciesForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegistrationPoliciesForUserGroupResponse setBody(ListRegistrationPoliciesForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegistrationPoliciesForUserGroupResponseBody getBody() {
        return this.body;
    }

}
