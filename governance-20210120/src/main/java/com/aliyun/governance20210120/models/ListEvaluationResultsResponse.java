// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluationResultsResponseBody body;

    public static ListEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationResultsResponse self = new ListEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluationResultsResponse setBody(ListEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
