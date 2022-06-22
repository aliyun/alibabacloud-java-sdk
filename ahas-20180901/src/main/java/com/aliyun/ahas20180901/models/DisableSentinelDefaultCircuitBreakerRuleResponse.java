// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelDefaultCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSentinelDefaultCircuitBreakerRuleResponseBody body;

    public static DisableSentinelDefaultCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelDefaultCircuitBreakerRuleResponse self = new DisableSentinelDefaultCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponse setBody(DisableSentinelDefaultCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSentinelDefaultCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
