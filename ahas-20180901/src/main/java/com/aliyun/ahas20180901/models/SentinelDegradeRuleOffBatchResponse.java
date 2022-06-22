// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOffBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleOffBatchResponseBody body;

    public static SentinelDegradeRuleOffBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOffBatchResponse self = new SentinelDegradeRuleOffBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOffBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleOffBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleOffBatchResponse setBody(SentinelDegradeRuleOffBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleOffBatchResponseBody getBody() {
        return this.body;
    }

}
