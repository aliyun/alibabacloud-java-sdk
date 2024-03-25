// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeFlowlogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowlogsResponseBody body;

    public static DescribeFlowlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowlogsResponse self = new DescribeFlowlogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowlogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowlogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowlogsResponse setBody(DescribeFlowlogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowlogsResponseBody getBody() {
        return this.body;
    }

}
