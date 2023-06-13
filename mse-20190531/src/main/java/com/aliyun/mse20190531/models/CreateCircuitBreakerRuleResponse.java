// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCircuitBreakerRuleResponseBody body;

    public static CreateCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCircuitBreakerRuleResponse self = new CreateCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCircuitBreakerRuleResponse setBody(CreateCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
