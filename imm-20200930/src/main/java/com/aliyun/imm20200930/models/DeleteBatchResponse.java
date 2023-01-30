// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBatchResponseBody body;

    public static DeleteBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchResponse self = new DeleteBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBatchResponse setBody(DeleteBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBatchResponseBody getBody() {
        return this.body;
    }

}
