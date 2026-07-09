// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluationRunsResponseBody body;

    public static ListEvaluationRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationRunsResponse self = new ListEvaluationRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluationRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluationRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluationRunsResponse setBody(ListEvaluationRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluationRunsResponseBody getBody() {
        return this.body;
    }

}
