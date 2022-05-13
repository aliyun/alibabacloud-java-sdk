// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowNodeInstanceResponseBody body;

    public static DescribeFlowNodeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceResponse self = new DescribeFlowNodeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowNodeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowNodeInstanceResponse setBody(DescribeFlowNodeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowNodeInstanceResponseBody getBody() {
        return this.body;
    }

}
