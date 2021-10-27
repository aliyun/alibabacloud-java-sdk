// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopEvaluateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopEvaluateTaskResponseBody body;

    public static StopEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEvaluateTaskResponse self = new StopEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopEvaluateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopEvaluateTaskResponse setBody(StopEvaluateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopEvaluateTaskResponseBody getBody() {
        return this.body;
    }

}
