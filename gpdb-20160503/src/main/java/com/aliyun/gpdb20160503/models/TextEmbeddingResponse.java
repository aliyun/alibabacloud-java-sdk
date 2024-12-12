// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TextEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextEmbeddingResponseBody body;

    public static TextEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        TextEmbeddingResponse self = new TextEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public TextEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextEmbeddingResponse setBody(TextEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public TextEmbeddingResponseBody getBody() {
        return this.body;
    }

}
