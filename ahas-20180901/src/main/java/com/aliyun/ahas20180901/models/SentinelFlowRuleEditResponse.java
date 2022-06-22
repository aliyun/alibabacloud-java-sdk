// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleEditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleEditResponseBody body;

    public static SentinelFlowRuleEditResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleEditResponse self = new SentinelFlowRuleEditResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleEditResponse setBody(SentinelFlowRuleEditResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleEditResponseBody getBody() {
        return this.body;
    }

}
