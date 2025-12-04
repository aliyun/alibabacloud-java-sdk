// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunQuickWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunQuickWritingResponseBody body;

    public static RunQuickWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunQuickWritingResponse self = new RunQuickWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunQuickWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunQuickWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunQuickWritingResponse setBody(RunQuickWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunQuickWritingResponseBody getBody() {
        return this.body;
    }

}
