// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupRefreshTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeGroupRefreshTaskResponseBody body;

    public static DescribeNodeGroupRefreshTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupRefreshTaskResponse self = new DescribeNodeGroupRefreshTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupRefreshTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeGroupRefreshTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeGroupRefreshTaskResponse setBody(DescribeNodeGroupRefreshTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeGroupRefreshTaskResponseBody getBody() {
        return this.body;
    }

}
