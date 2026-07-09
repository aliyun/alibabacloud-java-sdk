// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEvaluationTaskResponseBody body;

    public static UpdateEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluationTaskResponse self = new UpdateEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEvaluationTaskResponse setBody(UpdateEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
