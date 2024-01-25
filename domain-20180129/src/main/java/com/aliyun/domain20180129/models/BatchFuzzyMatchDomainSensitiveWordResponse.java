// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class BatchFuzzyMatchDomainSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchFuzzyMatchDomainSensitiveWordResponseBody body;

    public static BatchFuzzyMatchDomainSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchFuzzyMatchDomainSensitiveWordResponse self = new BatchFuzzyMatchDomainSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse setBody(BatchFuzzyMatchDomainSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchFuzzyMatchDomainSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
