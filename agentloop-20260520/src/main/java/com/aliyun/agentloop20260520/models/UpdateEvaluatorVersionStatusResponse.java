// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorVersionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEvaluatorVersionStatusResponseBody body;

    public static UpdateEvaluatorVersionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorVersionStatusResponse self = new UpdateEvaluatorVersionStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorVersionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEvaluatorVersionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEvaluatorVersionStatusResponse setBody(UpdateEvaluatorVersionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEvaluatorVersionStatusResponseBody getBody() {
        return this.body;
    }

}
