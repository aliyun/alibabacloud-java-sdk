// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluatePreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEvaluatePreCheckTaskResponseBody body;

    public static CreateEvaluatePreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatePreCheckTaskResponse self = new CreateEvaluatePreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatePreCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluatePreCheckTaskResponse setBody(CreateEvaluatePreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluatePreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
