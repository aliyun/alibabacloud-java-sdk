// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEvaluateTaskResponseBody body;

    public static CreateEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateTaskResponse self = new CreateEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluateTaskResponse setBody(CreateEvaluateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluateTaskResponseBody getBody() {
        return this.body;
    }

}
