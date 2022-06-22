// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleEditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleEditResponseBody body;

    public static SentinelGatewayFlowRuleEditResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleEditResponse self = new SentinelGatewayFlowRuleEditResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleEditResponse setBody(SentinelGatewayFlowRuleEditResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleEditResponseBody getBody() {
        return this.body;
    }

}
