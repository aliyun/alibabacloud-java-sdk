// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTextPolishingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTextPolishingResponseBody body;

    public static RunTextPolishingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTextPolishingResponse self = new RunTextPolishingResponse();
        return TeaModel.build(map, self);
    }

    public RunTextPolishingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTextPolishingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTextPolishingResponse setBody(RunTextPolishingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTextPolishingResponseBody getBody() {
        return this.body;
    }

}
