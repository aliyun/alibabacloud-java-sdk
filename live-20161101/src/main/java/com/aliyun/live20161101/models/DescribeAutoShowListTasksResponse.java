// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoShowListTasksResponseBody body;

    public static DescribeAutoShowListTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoShowListTasksResponse self = new DescribeAutoShowListTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoShowListTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoShowListTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoShowListTasksResponse setBody(DescribeAutoShowListTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoShowListTasksResponseBody getBody() {
        return this.body;
    }

}
