// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public FuzzyMatchDomainSensitiveWordResponse setBody(FuzzyMatchDomainSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public FuzzyMatchDomainSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
