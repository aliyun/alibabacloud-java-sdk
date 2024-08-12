// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class PreviewDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewDocumentResponseBody body;

    public static PreviewDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewDocumentResponse self = new PreviewDocumentResponse();
        return TeaModel.build(map, self);
    }

    public PreviewDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewDocumentResponse setBody(PreviewDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewDocumentResponseBody getBody() {
        return this.body;
    }

}
