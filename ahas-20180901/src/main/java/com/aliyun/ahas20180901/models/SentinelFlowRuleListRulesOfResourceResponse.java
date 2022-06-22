// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleListRulesOfResourceResponseBody body;

    public static SentinelFlowRuleListRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListRulesOfResourceResponse self = new SentinelFlowRuleListRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleListRulesOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleListRulesOfResourceResponse setBody(SentinelFlowRuleListRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleListRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
