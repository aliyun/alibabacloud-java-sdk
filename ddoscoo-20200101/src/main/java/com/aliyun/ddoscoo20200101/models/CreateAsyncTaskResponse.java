// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAsyncTaskResponseBody body;

    public static CreateAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskResponse self = new CreateAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAsyncTaskResponse setBody(CreateAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
