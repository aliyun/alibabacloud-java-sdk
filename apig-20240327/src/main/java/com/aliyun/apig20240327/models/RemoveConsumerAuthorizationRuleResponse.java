// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RemoveConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveConsumerAuthorizationRuleResponseBody body;

    public static RemoveConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumerAuthorizationRuleResponse self = new RemoveConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveConsumerAuthorizationRuleResponse setBody(RemoveConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
