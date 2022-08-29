// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteBatchProjectMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBatchProjectMetaResponseBody body;

    public static DeleteBatchProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchProjectMetaResponse self = new DeleteBatchProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBatchProjectMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBatchProjectMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBatchProjectMetaResponse setBody(DeleteBatchProjectMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBatchProjectMetaResponseBody getBody() {
        return this.body;
    }

}
