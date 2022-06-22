// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleOnBatchResponseBody body;

    public static SentinelSystemRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOnBatchResponse self = new SentinelSystemRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleOnBatchResponse setBody(SentinelSystemRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
