// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevertAggregateEvaluationResultsResponseBody body;

    public static RevertAggregateEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertAggregateEvaluationResultsResponse self = new RevertAggregateEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public RevertAggregateEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertAggregateEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertAggregateEvaluationResultsResponse setBody(RevertAggregateEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertAggregateEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
