// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DocumentTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocumentTranslateResponseBody body;

    public static DocumentTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        DocumentTranslateResponse self = new DocumentTranslateResponse();
        return TeaModel.build(map, self);
    }

    public DocumentTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocumentTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocumentTranslateResponse setBody(DocumentTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public DocumentTranslateResponseBody getBody() {
        return this.body;
    }

}
