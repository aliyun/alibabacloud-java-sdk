// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEvaluatorResponseBody body;

    public static GetEvaluatorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorResponse self = new GetEvaluatorResponse();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEvaluatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEvaluatorResponse setBody(GetEvaluatorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEvaluatorResponseBody getBody() {
        return this.body;
    }

}
