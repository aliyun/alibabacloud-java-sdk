// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleOffBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleOffBatchResponseBody body;

    public static SentinelGatewayFlowRuleOffBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleOffBatchResponse self = new SentinelGatewayFlowRuleOffBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleOffBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleOffBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleOffBatchResponse setBody(SentinelGatewayFlowRuleOffBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleOffBatchResponseBody getBody() {
        return this.body;
    }

}
