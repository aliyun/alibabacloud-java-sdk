// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeWorkflowActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWorkflowActivityResponseBody body;

    public static DescribeWorkflowActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowActivityResponse self = new DescribeWorkflowActivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkflowActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkflowActivityResponse setBody(DescribeWorkflowActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkflowActivityResponseBody getBody() {
        return this.body;
    }

}
