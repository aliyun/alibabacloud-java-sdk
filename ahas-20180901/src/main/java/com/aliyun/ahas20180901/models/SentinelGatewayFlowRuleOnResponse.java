// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleOnResponseBody body;

    public static SentinelGatewayFlowRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleOnResponse self = new SentinelGatewayFlowRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleOnResponse setBody(SentinelGatewayFlowRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleOnResponseBody getBody() {
        return this.body;
    }

}
