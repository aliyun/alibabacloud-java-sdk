// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StopAiCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAiCallTaskResponseBody body;

    public static StopAiCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAiCallTaskResponse self = new StopAiCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopAiCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAiCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAiCallTaskResponse setBody(StopAiCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAiCallTaskResponseBody getBody() {
        return this.body;
    }

}
