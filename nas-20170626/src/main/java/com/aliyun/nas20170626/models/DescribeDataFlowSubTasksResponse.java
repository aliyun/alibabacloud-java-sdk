// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowSubTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataFlowSubTasksResponseBody body;

    public static DescribeDataFlowSubTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowSubTasksResponse self = new DescribeDataFlowSubTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowSubTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataFlowSubTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataFlowSubTasksResponse setBody(DescribeDataFlowSubTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataFlowSubTasksResponseBody getBody() {
        return this.body;
    }

}
