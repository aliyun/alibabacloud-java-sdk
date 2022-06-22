// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleOffResponseBody body;

    public static SentinelWebFlowRuleOffResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOffResponse self = new SentinelWebFlowRuleOffResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleOffResponse setBody(SentinelWebFlowRuleOffResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleOffResponseBody getBody() {
        return this.body;
    }

}
