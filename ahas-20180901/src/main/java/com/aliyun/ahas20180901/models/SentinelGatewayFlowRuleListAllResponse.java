// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleListAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleListAllResponseBody body;

    public static SentinelGatewayFlowRuleListAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleListAllResponse self = new SentinelGatewayFlowRuleListAllResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleListAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleListAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleListAllResponse setBody(SentinelGatewayFlowRuleListAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleListAllResponseBody getBody() {
        return this.body;
    }

}
