// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleListRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayFlowRuleListRulesOfResourceResponseBody body;

    public static SentinelGatewayFlowRuleListRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleListRulesOfResourceResponse self = new SentinelGatewayFlowRuleListRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleListRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayFlowRuleListRulesOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayFlowRuleListRulesOfResourceResponse setBody(SentinelGatewayFlowRuleListRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayFlowRuleListRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
