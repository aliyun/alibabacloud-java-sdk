// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataFlowsResponseBody body;

    public static DescribeDataFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowsResponse self = new DescribeDataFlowsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataFlowsResponse setBody(DescribeDataFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataFlowsResponseBody getBody() {
        return this.body;
    }

}
