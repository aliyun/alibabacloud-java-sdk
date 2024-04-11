// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayCircuitBreakerRuleResponseBody body;

    public static ListGatewayCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayCircuitBreakerRuleResponse self = new ListGatewayCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayCircuitBreakerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayCircuitBreakerRuleResponse setBody(ListGatewayCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
