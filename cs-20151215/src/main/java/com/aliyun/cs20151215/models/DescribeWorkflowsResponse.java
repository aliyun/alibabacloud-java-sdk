// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkflowsResponse setBody(DescribeWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkflowsResponseBody getBody() {
        return this.body;
    }

}
