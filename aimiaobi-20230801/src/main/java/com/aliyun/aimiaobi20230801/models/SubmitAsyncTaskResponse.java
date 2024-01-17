// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAsyncTaskResponseBody body;

    public static SubmitAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncTaskResponse self = new SubmitAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAsyncTaskResponse setBody(SubmitAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
