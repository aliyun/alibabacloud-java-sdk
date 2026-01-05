// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFileUploadResponseBody body;

    public static DeleteFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileUploadResponse self = new DeleteFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFileUploadResponse setBody(DeleteFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileUploadResponseBody getBody() {
        return this.body;
    }

}
