// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleOnBatchResponseBody body;

    public static SentinelWebFlowRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOnBatchResponse self = new SentinelWebFlowRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleOnBatchResponse setBody(SentinelWebFlowRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
