// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAiHelperWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAiHelperWritingResponseBody body;

    public static RunAiHelperWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAiHelperWritingResponse self = new RunAiHelperWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunAiHelperWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAiHelperWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAiHelperWritingResponse setBody(RunAiHelperWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAiHelperWritingResponseBody getBody() {
        return this.body;
    }

}
