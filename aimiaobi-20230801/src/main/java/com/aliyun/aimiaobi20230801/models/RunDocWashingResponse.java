// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocWashingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocWashingResponseBody body;

    public static RunDocWashingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocWashingResponse self = new RunDocWashingResponse();
        return TeaModel.build(map, self);
    }

    public RunDocWashingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocWashingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocWashingResponse setBody(RunDocWashingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocWashingResponseBody getBody() {
        return this.body;
    }

}
