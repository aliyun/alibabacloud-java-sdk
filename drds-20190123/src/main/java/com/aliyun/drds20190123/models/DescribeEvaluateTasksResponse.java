// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEvaluateTasksResponseBody body;

    public static DescribeEvaluateTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTasksResponse self = new DescribeEvaluateTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateTasksResponse setBody(DescribeEvaluateTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateTasksResponseBody getBody() {
        return this.body;
    }

}
