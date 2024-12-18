// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDatasetDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetDocumentResponseBody body;

    public static DeleteDatasetDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetDocumentResponse self = new DeleteDatasetDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetDocumentResponse setBody(DeleteDatasetDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetDocumentResponseBody getBody() {
        return this.body;
    }

}
