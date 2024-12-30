// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBatchTaskResponseBody body;

    public static DeleteBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchTaskResponse self = new DeleteBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBatchTaskResponse setBody(DeleteBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBatchTaskResponseBody getBody() {
        return this.body;
    }

}
