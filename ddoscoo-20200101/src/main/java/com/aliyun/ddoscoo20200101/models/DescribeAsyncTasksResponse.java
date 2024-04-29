// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAsyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAsyncTasksResponseBody body;

    public static DescribeAsyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTasksResponse self = new DescribeAsyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAsyncTasksResponse setBody(DescribeAsyncTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncTasksResponseBody getBody() {
        return this.body;
    }

}
