// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteCircuitBreakerRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCircuitBreakerRulesResponseBody body;

    public static DeleteCircuitBreakerRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCircuitBreakerRulesResponse self = new DeleteCircuitBreakerRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCircuitBreakerRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCircuitBreakerRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCircuitBreakerRulesResponse setBody(DeleteCircuitBreakerRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCircuitBreakerRulesResponseBody getBody() {
        return this.body;
    }

}
