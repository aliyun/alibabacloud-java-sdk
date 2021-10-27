// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartEvaluateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartEvaluateTaskResponseBody body;

    public static StartEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluateTaskResponse self = new StartEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartEvaluateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEvaluateTaskResponse setBody(StartEvaluateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEvaluateTaskResponseBody getBody() {
        return this.body;
    }

}
