// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayFlowRuleResponseBody body;

    public static CreateGatewayFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFlowRuleResponse self = new CreateGatewayFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayFlowRuleResponse setBody(CreateGatewayFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayFlowRuleResponseBody getBody() {
        return this.body;
    }

}
