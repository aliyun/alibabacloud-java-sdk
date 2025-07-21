// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConsumerAuthorizationRuleResponseBody body;

    public static UpdateConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerAuthorizationRuleResponse self = new UpdateConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConsumerAuthorizationRuleResponse setBody(UpdateConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
