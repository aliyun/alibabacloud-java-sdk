// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCircuitBreakerRuleResponseBody body;

    public static UpdateCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCircuitBreakerRuleResponse self = new UpdateCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCircuitBreakerRuleResponse setBody(UpdateCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
