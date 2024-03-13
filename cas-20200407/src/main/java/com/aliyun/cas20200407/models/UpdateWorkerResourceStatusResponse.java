// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkerResourceStatusResponseBody body;

    public static UpdateWorkerResourceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResourceStatusResponse self = new UpdateWorkerResourceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResourceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkerResourceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkerResourceStatusResponse setBody(UpdateWorkerResourceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkerResourceStatusResponseBody getBody() {
        return this.body;
    }

}
