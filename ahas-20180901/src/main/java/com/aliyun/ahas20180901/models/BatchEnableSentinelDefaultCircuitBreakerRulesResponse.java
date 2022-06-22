// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchEnableSentinelDefaultCircuitBreakerRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody body;

    public static BatchEnableSentinelDefaultCircuitBreakerRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableSentinelDefaultCircuitBreakerRulesResponse self = new BatchEnableSentinelDefaultCircuitBreakerRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponse setBody(BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody getBody() {
        return this.body;
    }

}
