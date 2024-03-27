// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWorkflowInstanceResponseBody body;

    public static DescribeWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowInstanceResponse self = new DescribeWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkflowInstanceResponse setBody(DescribeWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
