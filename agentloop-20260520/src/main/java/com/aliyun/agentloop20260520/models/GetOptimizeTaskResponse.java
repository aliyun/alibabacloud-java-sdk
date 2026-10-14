// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetOptimizeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOptimizeTaskResponseBody body;

    public static GetOptimizeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOptimizeTaskResponse self = new GetOptimizeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetOptimizeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOptimizeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOptimizeTaskResponse setBody(GetOptimizeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOptimizeTaskResponseBody getBody() {
        return this.body;
    }

}
