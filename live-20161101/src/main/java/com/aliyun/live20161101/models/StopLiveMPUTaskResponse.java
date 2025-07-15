// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLiveMPUTaskResponseBody body;

    public static StopLiveMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveMPUTaskResponse self = new StopLiveMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLiveMPUTaskResponse setBody(StopLiveMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveMPUTaskResponseBody getBody() {
        return this.body;
    }

}
