// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayFlowRuleResponseBody body;

    public static UpdateGatewayFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFlowRuleResponse self = new UpdateGatewayFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayFlowRuleResponse setBody(UpdateGatewayFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayFlowRuleResponseBody getBody() {
        return this.body;
    }

}
