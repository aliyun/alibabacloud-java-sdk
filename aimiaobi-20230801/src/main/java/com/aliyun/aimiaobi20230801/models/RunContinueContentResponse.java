// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunContinueContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunContinueContentResponseBody body;

    public static RunContinueContentResponse build(java.util.Map<String, ?> map) throws Exception {
        RunContinueContentResponse self = new RunContinueContentResponse();
        return TeaModel.build(map, self);
    }

    public RunContinueContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunContinueContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunContinueContentResponse setBody(RunContinueContentResponseBody body) {
        this.body = body;
        return this;
    }
    public RunContinueContentResponseBody getBody() {
        return this.body;
    }

}
