// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListCircuitBreakerRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCircuitBreakerRulesResponseBody body;

    public static ListCircuitBreakerRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCircuitBreakerRulesResponse self = new ListCircuitBreakerRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListCircuitBreakerRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCircuitBreakerRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCircuitBreakerRulesResponse setBody(ListCircuitBreakerRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCircuitBreakerRulesResponseBody getBody() {
        return this.body;
    }

}
