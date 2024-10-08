// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePdfTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePdfTranslateTaskResponseBody body;

    public static CreatePdfTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdfTranslateTaskResponse self = new CreatePdfTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdfTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdfTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdfTranslateTaskResponse setBody(CreatePdfTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePdfTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
