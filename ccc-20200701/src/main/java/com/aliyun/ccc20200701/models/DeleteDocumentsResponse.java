// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDocumentsResponseBody body;

    public static DeleteDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentsResponse self = new DeleteDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocumentsResponse setBody(DeleteDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocumentsResponseBody getBody() {
        return this.body;
    }

}
