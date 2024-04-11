// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayCircuitBreakerRuleResponseBody body;

    public static DeleteGatewayCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayCircuitBreakerRuleResponse self = new DeleteGatewayCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayCircuitBreakerRuleResponse setBody(DeleteGatewayCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
