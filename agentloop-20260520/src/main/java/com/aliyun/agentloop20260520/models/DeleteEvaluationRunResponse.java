// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluationRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEvaluationRunResponseBody body;

    public static DeleteEvaluationRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluationRunResponse self = new DeleteEvaluationRunResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluationRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEvaluationRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEvaluationRunResponse setBody(DeleteEvaluationRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEvaluationRunResponseBody getBody() {
        return this.body;
    }

}
