// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleListByPageResponseBody body;

    public static SentinelFlowRuleListByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListByPageResponse self = new SentinelFlowRuleListByPageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleListByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleListByPageResponse setBody(SentinelFlowRuleListByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleListByPageResponseBody getBody() {
        return this.body;
    }

}
