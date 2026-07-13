// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerMaxVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkerMaxVersionResponseBody body;

    public static GetWorkerMaxVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerMaxVersionResponse self = new GetWorkerMaxVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkerMaxVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkerMaxVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkerMaxVersionResponse setBody(GetWorkerMaxVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkerMaxVersionResponseBody getBody() {
        return this.body;
    }

}
