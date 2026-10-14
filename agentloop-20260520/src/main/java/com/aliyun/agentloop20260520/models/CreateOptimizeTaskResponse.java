// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOptimizeTaskResponseBody body;

    public static CreateOptimizeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeTaskResponse self = new CreateOptimizeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOptimizeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOptimizeTaskResponse setBody(CreateOptimizeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOptimizeTaskResponseBody getBody() {
        return this.body;
    }

}
