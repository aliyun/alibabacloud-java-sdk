// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SemanticQueryResponseBody body;

    public static SemanticQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SemanticQueryResponse self = new SemanticQueryResponse();
        return TeaModel.build(map, self);
    }

    public SemanticQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SemanticQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SemanticQueryResponse setBody(SemanticQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SemanticQueryResponseBody getBody() {
        return this.body;
    }

}
