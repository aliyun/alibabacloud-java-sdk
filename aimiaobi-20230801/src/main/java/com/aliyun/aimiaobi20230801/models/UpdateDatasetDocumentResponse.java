// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasetDocumentResponseBody body;

    public static UpdateDatasetDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetDocumentResponse self = new UpdateDatasetDocumentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetDocumentResponse setBody(UpdateDatasetDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetDocumentResponseBody getBody() {
        return this.body;
    }

}
