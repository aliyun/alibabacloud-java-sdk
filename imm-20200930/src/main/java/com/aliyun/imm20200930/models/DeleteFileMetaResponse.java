// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFileMetaResponseBody body;

    public static DeleteFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileMetaResponse self = new DeleteFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFileMetaResponse setBody(DeleteFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileMetaResponseBody getBody() {
        return this.body;
    }

}
