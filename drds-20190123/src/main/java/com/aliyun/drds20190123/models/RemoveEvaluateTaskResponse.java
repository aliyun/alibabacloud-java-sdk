// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveEvaluateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEvaluateTaskResponseBody body;

    public static RemoveEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEvaluateTaskResponse self = new RemoveEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEvaluateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEvaluateTaskResponse setBody(RemoveEvaluateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEvaluateTaskResponseBody getBody() {
        return this.body;
    }

}
