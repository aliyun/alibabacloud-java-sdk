// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveMPUTaskResponseBody body;

    public static UpdateLiveMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveMPUTaskResponse self = new UpdateLiveMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveMPUTaskResponse setBody(UpdateLiveMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveMPUTaskResponseBody getBody() {
        return this.body;
    }

}
