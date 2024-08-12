// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecallDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecallDocumentResponseBody body;

    public static RecallDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        RecallDocumentResponse self = new RecallDocumentResponse();
        return TeaModel.build(map, self);
    }

    public RecallDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecallDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecallDocumentResponse setBody(RecallDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public RecallDocumentResponseBody getBody() {
        return this.body;
    }

}
