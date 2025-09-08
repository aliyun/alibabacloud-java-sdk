// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDeepWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDeepWritingResponseBody body;

    public static RunDeepWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDeepWritingResponse self = new RunDeepWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunDeepWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDeepWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDeepWritingResponse setBody(RunDeepWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDeepWritingResponseBody getBody() {
        return this.body;
    }

}
