// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDocumentResponseBody body;

    public static UpdateDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentResponse self = new UpdateDocumentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDocumentResponse setBody(UpdateDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDocumentResponseBody getBody() {
        return this.body;
    }

}
