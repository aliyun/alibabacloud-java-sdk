// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterTasksResponseBody body;

    public static DescribeClusterTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterTasksResponse self = new DescribeClusterTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterTasksResponse setBody(DescribeClusterTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterTasksResponseBody getBody() {
        return this.body;
    }

}
