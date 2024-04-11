// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayFlowRuleResponseBody body;

    public static ListGatewayFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayFlowRuleResponse self = new ListGatewayFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayFlowRuleResponse setBody(ListGatewayFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayFlowRuleResponseBody getBody() {
        return this.body;
    }

}
