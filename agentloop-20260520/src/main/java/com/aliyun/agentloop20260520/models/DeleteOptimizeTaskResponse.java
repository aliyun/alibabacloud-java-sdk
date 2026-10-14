// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteOptimizeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOptimizeTaskResponseBody body;

    public static DeleteOptimizeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOptimizeTaskResponse self = new DeleteOptimizeTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOptimizeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOptimizeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOptimizeTaskResponse setBody(DeleteOptimizeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOptimizeTaskResponseBody getBody() {
        return this.body;
    }

}
