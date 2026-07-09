// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEvaluationTaskResponseBody body;

    public static CreateEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluationTaskResponse self = new CreateEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEvaluationTaskResponse setBody(CreateEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
