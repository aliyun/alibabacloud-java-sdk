// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkerResponseBody body;

    public static CreateWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerResponse self = new CreateWorkerResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkerResponse setBody(CreateWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkerResponseBody getBody() {
        return this.body;
    }

}
