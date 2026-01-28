// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupsForAuthorizationRuleResponseBody body;

    public static ListGroupsForAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForAuthorizationRuleResponse self = new ListGroupsForAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsForAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupsForAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupsForAuthorizationRuleResponse setBody(ListGroupsForAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsForAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
