// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelDefaultCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditSentinelDefaultCircuitBreakerRuleResponseBody body;

    public static EditSentinelDefaultCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelDefaultCircuitBreakerRuleResponse self = new EditSentinelDefaultCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditSentinelDefaultCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSentinelDefaultCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditSentinelDefaultCircuitBreakerRuleResponse setBody(EditSentinelDefaultCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSentinelDefaultCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
