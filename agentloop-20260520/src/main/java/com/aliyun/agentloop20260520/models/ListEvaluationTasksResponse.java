// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluationTasksResponseBody body;

    public static ListEvaluationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationTasksResponse self = new ListEvaluationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluationTasksResponse setBody(ListEvaluationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluationTasksResponseBody getBody() {
        return this.body;
    }

}
