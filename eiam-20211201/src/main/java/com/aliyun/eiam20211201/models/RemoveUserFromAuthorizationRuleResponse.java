// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUserFromAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserFromAuthorizationRuleResponseBody body;

    public static RemoveUserFromAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromAuthorizationRuleResponse self = new RemoveUserFromAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserFromAuthorizationRuleResponse setBody(RemoveUserFromAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
