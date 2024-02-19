// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDocumentCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDocumentCollectionResponseBody body;

    public static DeleteDocumentCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentCollectionResponse self = new DeleteDocumentCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocumentCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocumentCollectionResponse setBody(DeleteDocumentCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocumentCollectionResponseBody getBody() {
        return this.body;
    }

}
