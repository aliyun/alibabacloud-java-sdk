// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleNewResponseBody body;

    public static SentinelFlowRuleNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleNewResponse self = new SentinelFlowRuleNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleNewResponse setBody(SentinelFlowRuleNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleNewResponseBody getBody() {
        return this.body;
    }

}
