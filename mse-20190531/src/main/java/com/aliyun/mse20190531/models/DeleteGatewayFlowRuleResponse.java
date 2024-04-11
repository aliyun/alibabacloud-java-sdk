// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayFlowRuleResponseBody body;

    public static DeleteGatewayFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayFlowRuleResponse self = new DeleteGatewayFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayFlowRuleResponse setBody(DeleteGatewayFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayFlowRuleResponseBody getBody() {
        return this.body;
    }

}
