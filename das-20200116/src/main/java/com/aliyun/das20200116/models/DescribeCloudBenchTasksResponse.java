// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCloudBenchTasksResponse setBody(DescribeCloudBenchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

}
