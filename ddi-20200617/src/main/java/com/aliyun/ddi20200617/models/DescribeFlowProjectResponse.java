// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowProjectResponseBody body;

    public static DescribeFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowProjectResponse self = new DescribeFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowProjectResponse setBody(DescribeFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowProjectResponseBody getBody() {
        return this.body;
    }

}
