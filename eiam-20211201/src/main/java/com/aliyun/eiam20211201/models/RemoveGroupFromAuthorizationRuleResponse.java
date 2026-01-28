// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveGroupFromAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveGroupFromAuthorizationRuleResponseBody body;

    public static RemoveGroupFromAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupFromAuthorizationRuleResponse self = new RemoveGroupFromAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupFromAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupFromAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGroupFromAuthorizationRuleResponse setBody(RemoveGroupFromAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupFromAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
