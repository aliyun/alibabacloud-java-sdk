// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAsyncTaskResponseBody body;

    public static DeleteAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsyncTaskResponse self = new DeleteAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAsyncTaskResponse setBody(DeleteAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
