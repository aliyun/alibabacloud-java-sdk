// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleOnBatchResponseBody body;

    public static SentinelGatewayFlowRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleOnBatchResponse self = new SentinelGatewayFlowRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleOnBatchResponse setBody(SentinelGatewayFlowRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
