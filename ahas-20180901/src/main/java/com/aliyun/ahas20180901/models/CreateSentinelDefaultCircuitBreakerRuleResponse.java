// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelDefaultCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSentinelDefaultCircuitBreakerRuleResponseBody body;

    public static CreateSentinelDefaultCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelDefaultCircuitBreakerRuleResponse self = new CreateSentinelDefaultCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSentinelDefaultCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSentinelDefaultCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSentinelDefaultCircuitBreakerRuleResponse setBody(CreateSentinelDefaultCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSentinelDefaultCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
