// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleOnBatchResponseBody body;

    public static SentinelDegradeRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOnBatchResponse self = new SentinelDegradeRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleOnBatchResponse setBody(SentinelDegradeRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
