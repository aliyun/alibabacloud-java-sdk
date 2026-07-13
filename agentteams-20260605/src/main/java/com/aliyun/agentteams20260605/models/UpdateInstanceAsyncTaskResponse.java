// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceAsyncTaskResponseBody body;

    public static UpdateInstanceAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAsyncTaskResponse self = new UpdateInstanceAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceAsyncTaskResponse setBody(UpdateInstanceAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
