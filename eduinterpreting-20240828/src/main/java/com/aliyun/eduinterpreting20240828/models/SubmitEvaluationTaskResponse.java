// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class SubmitEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEvaluationTaskResponseBody body;

    public static SubmitEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEvaluationTaskResponse self = new SubmitEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEvaluationTaskResponse setBody(SubmitEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
