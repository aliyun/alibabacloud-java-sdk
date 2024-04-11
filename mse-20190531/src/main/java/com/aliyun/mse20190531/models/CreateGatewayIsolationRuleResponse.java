// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayIsolationRuleResponseBody body;

    public static CreateGatewayIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIsolationRuleResponse self = new CreateGatewayIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayIsolationRuleResponse setBody(CreateGatewayIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
