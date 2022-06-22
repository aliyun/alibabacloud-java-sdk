// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleDeleteResponseBody body;

    public static SentinelGatewayFlowRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleDeleteResponse self = new SentinelGatewayFlowRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleDeleteResponse setBody(SentinelGatewayFlowRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
