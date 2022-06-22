// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleOnResponseBody body;

    public static SentinelFlowRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleOnResponse self = new SentinelFlowRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleOnResponse setBody(SentinelFlowRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleOnResponseBody getBody() {
        return this.body;
    }

}
