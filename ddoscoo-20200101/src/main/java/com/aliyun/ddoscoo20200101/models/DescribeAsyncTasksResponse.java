// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAsyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAsyncTasksResponse setBody(DescribeAsyncTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncTasksResponseBody getBody() {
        return this.body;
    }

}
