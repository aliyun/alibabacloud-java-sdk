// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartAiCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAiCallTaskResponseBody body;

    public static StartAiCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAiCallTaskResponse self = new StartAiCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartAiCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAiCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAiCallTaskResponse setBody(StartAiCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAiCallTaskResponseBody getBody() {
        return this.body;
    }

}
