// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmbeddingResponseBody body;

    public static GetEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbeddingResponse self = new GetEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmbeddingResponse setBody(GetEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmbeddingResponseBody getBody() {
        return this.body;
    }

}
