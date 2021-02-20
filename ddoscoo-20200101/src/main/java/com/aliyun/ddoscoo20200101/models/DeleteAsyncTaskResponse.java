// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteAsyncTaskResponse setBody(DeleteAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
