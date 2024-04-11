// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayCircuitBreakerRuleResponseBody body;

    public static CreateGatewayCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayCircuitBreakerRuleResponse self = new CreateGatewayCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayCircuitBreakerRuleResponse setBody(CreateGatewayCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
