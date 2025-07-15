// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLiveMPUTaskResponseBody body;

    public static StartLiveMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveMPUTaskResponse self = new StartLiveMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLiveMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLiveMPUTaskResponse setBody(StartLiveMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLiveMPUTaskResponseBody getBody() {
        return this.body;
    }

}
