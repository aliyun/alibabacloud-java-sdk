// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDocumentAsyncResponseBody body;

    public static UploadDocumentAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncResponse self = new UploadDocumentAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDocumentAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDocumentAsyncResponse setBody(UploadDocumentAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDocumentAsyncResponseBody getBody() {
        return this.body;
    }

}
