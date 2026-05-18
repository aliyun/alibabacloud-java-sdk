// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpsertDocumentChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertDocumentChunksResponseBody body;

    public static UpsertDocumentChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertDocumentChunksResponse self = new UpsertDocumentChunksResponse();
        return TeaModel.build(map, self);
    }

    public UpsertDocumentChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertDocumentChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertDocumentChunksResponse setBody(UpsertDocumentChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertDocumentChunksResponseBody getBody() {
        return this.body;
    }

}
