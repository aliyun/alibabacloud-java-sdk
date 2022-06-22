// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleNewResponseBody body;

    public static SentinelGatewayFlowRuleNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleNewResponse self = new SentinelGatewayFlowRuleNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleNewResponse setBody(SentinelGatewayFlowRuleNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleNewResponseBody getBody() {
        return this.body;
    }

}
