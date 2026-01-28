// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersForAuthorizationRuleResponseBody body;

    public static ListUsersForAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForAuthorizationRuleResponse self = new ListUsersForAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersForAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersForAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersForAuthorizationRuleResponse setBody(ListUsersForAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersForAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
