// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTimingSyntheticTaskResponseBody body;

    public static DeleteTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTimingSyntheticTaskResponse self = new DeleteTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTimingSyntheticTaskResponse setBody(DeleteTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
