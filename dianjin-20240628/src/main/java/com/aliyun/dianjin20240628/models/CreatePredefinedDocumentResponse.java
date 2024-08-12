// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePredefinedDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePredefinedDocumentResponseBody body;

    public static CreatePredefinedDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePredefinedDocumentResponse self = new CreatePredefinedDocumentResponse();
        return TeaModel.build(map, self);
    }

    public CreatePredefinedDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePredefinedDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePredefinedDocumentResponse setBody(CreatePredefinedDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePredefinedDocumentResponseBody getBody() {
        return this.body;
    }

}
