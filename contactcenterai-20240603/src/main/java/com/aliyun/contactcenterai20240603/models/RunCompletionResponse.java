// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCompletionResponseBody body;

    public static RunCompletionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionResponse self = new RunCompletionResponse();
        return TeaModel.build(map, self);
    }

    public RunCompletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCompletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCompletionResponse setBody(RunCompletionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCompletionResponseBody getBody() {
        return this.body;
    }

}
