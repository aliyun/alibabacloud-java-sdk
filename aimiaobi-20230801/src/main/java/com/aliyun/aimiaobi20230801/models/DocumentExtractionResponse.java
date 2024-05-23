// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DocumentExtractionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocumentExtractionResponseBody body;

    public static DocumentExtractionResponse build(java.util.Map<String, ?> map) throws Exception {
        DocumentExtractionResponse self = new DocumentExtractionResponse();
        return TeaModel.build(map, self);
    }

    public DocumentExtractionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocumentExtractionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocumentExtractionResponse setBody(DocumentExtractionResponseBody body) {
        this.body = body;
        return this;
    }
    public DocumentExtractionResponseBody getBody() {
        return this.body;
    }

}
