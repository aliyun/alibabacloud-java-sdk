// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertChunksResponseBody body;

    public static UpsertChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertChunksResponse self = new UpsertChunksResponse();
        return TeaModel.build(map, self);
    }

    public UpsertChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertChunksResponse setBody(UpsertChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertChunksResponseBody getBody() {
        return this.body;
    }

}
