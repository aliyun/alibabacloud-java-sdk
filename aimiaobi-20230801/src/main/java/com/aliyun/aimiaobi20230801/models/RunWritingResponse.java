// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunWritingResponseBody body;

    public static RunWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunWritingResponse self = new RunWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunWritingResponse setBody(RunWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunWritingResponseBody getBody() {
        return this.body;
    }

}
