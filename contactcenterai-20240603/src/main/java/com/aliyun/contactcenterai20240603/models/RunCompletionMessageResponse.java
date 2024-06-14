// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCompletionMessageResponseBody body;

    public static RunCompletionMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageResponse self = new RunCompletionMessageResponse();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCompletionMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCompletionMessageResponse setBody(RunCompletionMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCompletionMessageResponseBody getBody() {
        return this.body;
    }

}
