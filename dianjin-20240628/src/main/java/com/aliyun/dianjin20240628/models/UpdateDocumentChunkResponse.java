// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateDocumentChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDocumentChunkResponseBody body;

    public static UpdateDocumentChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentChunkResponse self = new UpdateDocumentChunkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDocumentChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDocumentChunkResponse setBody(UpdateDocumentChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDocumentChunkResponseBody getBody() {
        return this.body;
    }

}
