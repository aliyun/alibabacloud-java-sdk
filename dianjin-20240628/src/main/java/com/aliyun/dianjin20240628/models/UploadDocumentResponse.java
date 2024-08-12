// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UploadDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDocumentResponseBody body;

    public static UploadDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentResponse self = new UploadDocumentResponse();
        return TeaModel.build(map, self);
    }

    public UploadDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDocumentResponse setBody(UploadDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDocumentResponseBody getBody() {
        return this.body;
    }

}
