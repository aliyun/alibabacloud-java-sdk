// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateWorkerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkerResponseBody body;

    public static UpdateWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResponse self = new UpdateWorkerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkerResponse setBody(UpdateWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkerResponseBody getBody() {
        return this.body;
    }

}
