// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FuzzyMatchDomainSensitiveWordResponseBody body;

    public static FuzzyMatchDomainSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        FuzzyMatchDomainSensitiveWordResponse self = new FuzzyMatchDomainSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public FuzzyMatchDomainSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FuzzyMatchDomainSensitiveWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FuzzyMatchDomainSensitiveWordResponse setBody(FuzzyMatchDomainSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public FuzzyMatchDomainSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
