// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEvaluatorResponseBody body;

    public static CreateEvaluatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatorResponse self = new CreateEvaluatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEvaluatorResponse setBody(CreateEvaluatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluatorResponseBody getBody() {
        return this.body;
    }

}
