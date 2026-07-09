// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluationRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEvaluationRunResponseBody body;

    public static UpdateEvaluationRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluationRunResponse self = new UpdateEvaluationRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluationRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEvaluationRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEvaluationRunResponse setBody(UpdateEvaluationRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEvaluationRunResponseBody getBody() {
        return this.body;
    }

}
