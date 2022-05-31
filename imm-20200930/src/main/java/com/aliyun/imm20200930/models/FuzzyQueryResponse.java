// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FuzzyQueryResponseBody body;

    public static FuzzyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FuzzyQueryResponse self = new FuzzyQueryResponse();
        return TeaModel.build(map, self);
    }

    public FuzzyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FuzzyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FuzzyQueryResponse setBody(FuzzyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FuzzyQueryResponseBody getBody() {
        return this.body;
    }

}
