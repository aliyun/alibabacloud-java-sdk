// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleEditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleEditResponseBody body;

    public static SentinelWebFlowRuleEditResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleEditResponse self = new SentinelWebFlowRuleEditResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleEditResponse setBody(SentinelWebFlowRuleEditResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleEditResponseBody getBody() {
        return this.body;
    }

}
