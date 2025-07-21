// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeleteConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteConsumerAuthorizationRuleResponseBody body;

    public static BatchDeleteConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteConsumerAuthorizationRuleResponse self = new BatchDeleteConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteConsumerAuthorizationRuleResponse setBody(BatchDeleteConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
