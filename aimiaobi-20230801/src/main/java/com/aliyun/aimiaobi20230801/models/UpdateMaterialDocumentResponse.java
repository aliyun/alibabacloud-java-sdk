// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateMaterialDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMaterialDocumentResponseBody body;

    public static UpdateMaterialDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialDocumentResponse self = new UpdateMaterialDocumentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMaterialDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMaterialDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMaterialDocumentResponse setBody(UpdateMaterialDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMaterialDocumentResponseBody getBody() {
        return this.body;
    }

}
