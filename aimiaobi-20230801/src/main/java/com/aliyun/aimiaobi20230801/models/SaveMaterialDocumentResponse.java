// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveMaterialDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveMaterialDocumentResponseBody body;

    public static SaveMaterialDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMaterialDocumentResponse self = new SaveMaterialDocumentResponse();
        return TeaModel.build(map, self);
    }

    public SaveMaterialDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMaterialDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveMaterialDocumentResponse setBody(SaveMaterialDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMaterialDocumentResponseBody getBody() {
        return this.body;
    }

}
