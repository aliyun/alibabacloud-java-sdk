// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UpdateFotaTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFotaTaskResponseBody body;

    public static UpdateFotaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFotaTaskResponse self = new UpdateFotaTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFotaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFotaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFotaTaskResponse setBody(UpdateFotaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFotaTaskResponseBody getBody() {
        return this.body;
    }

}
