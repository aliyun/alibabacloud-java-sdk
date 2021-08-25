// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEvaluationResultsResponseBody body;

    public static DescribeEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluationResultsResponse self = new DescribeEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluationResultsResponse setBody(DescribeEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
