// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRefreshTasksResponseBody body;

    public static DescribeRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTasksResponse self = new DescribeRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRefreshTasksResponse setBody(DescribeRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
