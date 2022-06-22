// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleOnBatchResponseBody body;

    public static SentinelFlowRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleOnBatchResponse self = new SentinelFlowRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleOnBatchResponse setBody(SentinelFlowRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
