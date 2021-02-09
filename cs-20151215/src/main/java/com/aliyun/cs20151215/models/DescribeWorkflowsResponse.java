// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWorkflowsResponseBody body;

    public static DescribeWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowsResponse self = new DescribeWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkflowsResponse setBody(DescribeWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkflowsResponseBody getBody() {
        return this.body;
    }

}
