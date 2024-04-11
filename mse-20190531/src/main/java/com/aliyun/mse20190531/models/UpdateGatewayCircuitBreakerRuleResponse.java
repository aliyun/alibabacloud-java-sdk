// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayCircuitBreakerRuleResponseBody body;

    public static UpdateGatewayCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayCircuitBreakerRuleResponse self = new UpdateGatewayCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayCircuitBreakerRuleResponse setBody(UpdateGatewayCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
