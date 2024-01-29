// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceEvaluationResultsResponseBody body;

    public static ListResourceEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceEvaluationResultsResponse self = new ListResourceEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceEvaluationResultsResponse setBody(ListResourceEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
