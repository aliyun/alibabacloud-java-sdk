// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEvaluationTaskResponseBody body;

    public static DeleteEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluationTaskResponse self = new DeleteEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEvaluationTaskResponse setBody(DeleteEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
