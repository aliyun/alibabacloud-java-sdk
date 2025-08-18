// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunVideoScriptGenerateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunVideoScriptGenerateResponseBody body;

    public static RunVideoScriptGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        RunVideoScriptGenerateResponse self = new RunVideoScriptGenerateResponse();
        return TeaModel.build(map, self);
    }

    public RunVideoScriptGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunVideoScriptGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunVideoScriptGenerateResponse setBody(RunVideoScriptGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public RunVideoScriptGenerateResponseBody getBody() {
        return this.body;
    }

}
