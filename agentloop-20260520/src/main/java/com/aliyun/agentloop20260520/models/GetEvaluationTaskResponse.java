// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEvaluationTaskResponseBody body;

    public static GetEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluationTaskResponse self = new GetEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEvaluationTaskResponse setBody(GetEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
