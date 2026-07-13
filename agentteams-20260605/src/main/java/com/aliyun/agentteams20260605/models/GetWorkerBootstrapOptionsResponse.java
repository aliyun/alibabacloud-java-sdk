// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerBootstrapOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkerBootstrapOptionsResponseBody body;

    public static GetWorkerBootstrapOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerBootstrapOptionsResponse self = new GetWorkerBootstrapOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkerBootstrapOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkerBootstrapOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkerBootstrapOptionsResponse setBody(GetWorkerBootstrapOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkerBootstrapOptionsResponseBody getBody() {
        return this.body;
    }

}
