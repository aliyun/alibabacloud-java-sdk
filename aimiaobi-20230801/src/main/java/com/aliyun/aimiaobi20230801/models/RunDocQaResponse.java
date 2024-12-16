// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocQaResponseBody body;

    public static RunDocQaResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocQaResponse self = new RunDocQaResponse();
        return TeaModel.build(map, self);
    }

    public RunDocQaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocQaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocQaResponse setBody(RunDocQaResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocQaResponseBody getBody() {
        return this.body;
    }

}
