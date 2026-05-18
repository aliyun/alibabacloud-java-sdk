// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDocumentChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDocumentChunksResponseBody body;

    public static DeleteDocumentChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentChunksResponse self = new DeleteDocumentChunksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocumentChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocumentChunksResponse setBody(DeleteDocumentChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocumentChunksResponseBody getBody() {
        return this.body;
    }

}
