// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudBenchTasksResponseBody body;

    public static DescribeCloudBenchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudBenchTasksResponse self = new DescribeCloudBenchTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudBenchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudBenchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudBenchTasksResponse setBody(DescribeCloudBenchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

}
