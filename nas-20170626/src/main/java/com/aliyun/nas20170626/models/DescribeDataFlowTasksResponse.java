// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataFlowTasksResponseBody body;

    public static DescribeDataFlowTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowTasksResponse self = new DescribeDataFlowTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataFlowTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataFlowTasksResponse setBody(DescribeDataFlowTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataFlowTasksResponseBody getBody() {
        return this.body;
    }

}
