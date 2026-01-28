// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveApplicationFromAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApplicationFromAuthorizationRuleResponseBody body;

    public static RemoveApplicationFromAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationFromAuthorizationRuleResponse self = new RemoveApplicationFromAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationFromAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApplicationFromAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApplicationFromAuthorizationRuleResponse setBody(RemoveApplicationFromAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApplicationFromAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
