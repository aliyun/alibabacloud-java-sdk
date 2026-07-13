// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAsyncTaskResponseBody body;

    public static GetInstanceAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAsyncTaskResponse self = new GetInstanceAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAsyncTaskResponse setBody(GetInstanceAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
