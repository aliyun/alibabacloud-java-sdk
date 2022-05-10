// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterOperateLogsResponseBody body;

    public static DescribeClusterOperateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperateLogsResponse self = new DescribeClusterOperateLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterOperateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterOperateLogsResponse setBody(DescribeClusterOperateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterOperateLogsResponseBody getBody() {
        return this.body;
    }

}
