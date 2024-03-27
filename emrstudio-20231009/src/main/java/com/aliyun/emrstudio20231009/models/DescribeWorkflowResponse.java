// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWorkflowResponseBody body;

    public static DescribeWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowResponse self = new DescribeWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkflowResponse setBody(DescribeWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkflowResponseBody getBody() {
        return this.body;
    }

}
