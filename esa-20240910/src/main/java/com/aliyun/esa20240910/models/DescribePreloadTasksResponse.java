// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePreloadTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePreloadTasksResponseBody body;

    public static DescribePreloadTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadTasksResponse self = new DescribePreloadTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreloadTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreloadTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreloadTasksResponse setBody(DescribePreloadTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreloadTasksResponseBody getBody() {
        return this.body;
    }

}
