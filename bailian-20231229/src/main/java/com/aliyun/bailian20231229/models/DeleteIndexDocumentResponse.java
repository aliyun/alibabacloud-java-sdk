// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIndexDocumentResponseBody body;

    public static DeleteIndexDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexDocumentResponse self = new DeleteIndexDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndexDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndexDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndexDocumentResponse setBody(DeleteIndexDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndexDocumentResponseBody getBody() {
        return this.body;
    }

}
