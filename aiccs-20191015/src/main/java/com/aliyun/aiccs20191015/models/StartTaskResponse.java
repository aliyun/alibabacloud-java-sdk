// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTaskResponseBody body;

    public static StartTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTaskResponse self = new StartTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTaskResponse setBody(StartTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTaskResponseBody getBody() {
        return this.body;
    }

}
