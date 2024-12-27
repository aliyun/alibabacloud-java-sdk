// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContextualRetrievalResponseBody body;

    public static ContextualRetrievalResponse build(java.util.Map<String, ?> map) throws Exception {
        ContextualRetrievalResponse self = new ContextualRetrievalResponse();
        return TeaModel.build(map, self);
    }

    public ContextualRetrievalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContextualRetrievalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContextualRetrievalResponse setBody(ContextualRetrievalResponseBody body) {
        this.body = body;
        return this;
    }
    public ContextualRetrievalResponseBody getBody() {
        return this.body;
    }

}
