// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteWorkerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkerResponseBody body;

    public static DeleteWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkerResponse self = new DeleteWorkerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkerResponse setBody(DeleteWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkerResponseBody getBody() {
        return this.body;
    }

}
