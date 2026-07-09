// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEvaluatorResponseBody body;

    public static DeleteEvaluatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluatorResponse self = new DeleteEvaluatorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEvaluatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEvaluatorResponse setBody(DeleteEvaluatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEvaluatorResponseBody getBody() {
        return this.body;
    }

}
