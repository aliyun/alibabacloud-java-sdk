// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterWhiteListResponseBody body;

    public static DescribeClusterWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterWhiteListResponse self = new DescribeClusterWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterWhiteListResponse setBody(DescribeClusterWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterWhiteListResponseBody getBody() {
        return this.body;
    }

}
