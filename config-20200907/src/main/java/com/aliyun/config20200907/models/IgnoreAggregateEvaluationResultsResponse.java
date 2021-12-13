// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IgnoreAggregateEvaluationResultsResponseBody body;

    public static IgnoreAggregateEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAggregateEvaluationResultsResponse self = new IgnoreAggregateEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreAggregateEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreAggregateEvaluationResultsResponse setBody(IgnoreAggregateEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreAggregateEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
