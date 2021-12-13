// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public IgnoreEvaluationResultsResponse setBody(IgnoreEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
