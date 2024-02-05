// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecutePlatformTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecutePlatformTaskResponseBody body;

    public static ExecutePlatformTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecutePlatformTaskResponse self = new ExecutePlatformTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecutePlatformTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecutePlatformTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecutePlatformTaskResponse setBody(ExecutePlatformTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecutePlatformTaskResponseBody getBody() {
        return this.body;
    }

}
