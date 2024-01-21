// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteDocumentTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDocumentTagResponseBody body;

    public static DeleteDocumentTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentTagResponse self = new DeleteDocumentTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocumentTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocumentTagResponse setBody(DeleteDocumentTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocumentTagResponseBody getBody() {
        return this.body;
    }

}
