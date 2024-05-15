// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveDocumentResponseBody body;

    public static SaveDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDocumentResponse self = new SaveDocumentResponse();
        return TeaModel.build(map, self);
    }

    public SaveDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveDocumentResponse setBody(SaveDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDocumentResponseBody getBody() {
        return this.body;
    }

}
