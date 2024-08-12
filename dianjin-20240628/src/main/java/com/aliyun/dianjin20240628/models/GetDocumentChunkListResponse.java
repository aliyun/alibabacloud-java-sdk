// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentChunkListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentChunkListResponseBody body;

    public static GetDocumentChunkListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentChunkListResponse self = new GetDocumentChunkListResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentChunkListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentChunkListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentChunkListResponse setBody(GetDocumentChunkListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentChunkListResponseBody getBody() {
        return this.body;
    }

}
