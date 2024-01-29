// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IgnoreEvaluationResultsResponseBody body;

    public static IgnoreEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEvaluationResultsResponse self = new IgnoreEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IgnoreEvaluationResultsResponse setBody(IgnoreEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
