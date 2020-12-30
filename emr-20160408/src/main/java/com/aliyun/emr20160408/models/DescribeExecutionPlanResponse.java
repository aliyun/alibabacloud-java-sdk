// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeExecutionPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExecutionPlanResponseBody body;

    public static DescribeExecutionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionPlanResponse self = new DescribeExecutionPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExecutionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExecutionPlanResponse setBody(DescribeExecutionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExecutionPlanResponseBody getBody() {
        return this.body;
    }

}
