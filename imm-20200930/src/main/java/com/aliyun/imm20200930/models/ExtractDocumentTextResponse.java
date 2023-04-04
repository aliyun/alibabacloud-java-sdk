// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ExtractDocumentTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractDocumentTextResponseBody body;

    public static ExtractDocumentTextResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractDocumentTextResponse self = new ExtractDocumentTextResponse();
        return TeaModel.build(map, self);
    }

    public ExtractDocumentTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractDocumentTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtractDocumentTextResponse setBody(ExtractDocumentTextResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractDocumentTextResponseBody getBody() {
        return this.body;
    }

}
