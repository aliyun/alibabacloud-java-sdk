// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkerResponseBody body;

    public static GetWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerResponse self = new GetWorkerResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkerResponse setBody(GetWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkerResponseBody getBody() {
        return this.body;
    }

}
