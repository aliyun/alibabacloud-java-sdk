// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevertEvaluationResultsResponseBody body;

    public static RevertEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertEvaluationResultsResponse self = new RevertEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public RevertEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertEvaluationResultsResponse setBody(RevertEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
