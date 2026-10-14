// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOptimizeTaskResponseBody body;

    public static UpdateOptimizeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeTaskResponse self = new UpdateOptimizeTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOptimizeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOptimizeTaskResponse setBody(UpdateOptimizeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOptimizeTaskResponseBody getBody() {
        return this.body;
    }

}
