// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateResourceEvaluationResultsResponseBody body;

    public static ListAggregateResourceEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceEvaluationResultsResponse self = new ListAggregateResourceEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateResourceEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateResourceEvaluationResultsResponse setBody(ListAggregateResourceEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateResourceEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
