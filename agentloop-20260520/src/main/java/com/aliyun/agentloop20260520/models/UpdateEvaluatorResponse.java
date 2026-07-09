// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEvaluatorResponseBody body;

    public static UpdateEvaluatorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorResponse self = new UpdateEvaluatorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEvaluatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEvaluatorResponse setBody(UpdateEvaluatorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEvaluatorResponseBody getBody() {
        return this.body;
    }

}
