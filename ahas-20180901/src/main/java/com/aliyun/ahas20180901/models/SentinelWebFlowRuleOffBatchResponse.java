// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOffBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleOffBatchResponseBody body;

    public static SentinelWebFlowRuleOffBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOffBatchResponse self = new SentinelWebFlowRuleOffBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOffBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleOffBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleOffBatchResponse setBody(SentinelWebFlowRuleOffBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleOffBatchResponseBody getBody() {
        return this.body;
    }

}
