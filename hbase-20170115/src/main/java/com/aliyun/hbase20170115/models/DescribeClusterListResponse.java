// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterListResponseBody body;

    public static DescribeClusterListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterListResponse self = new DescribeClusterListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterListResponse setBody(DescribeClusterListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterListResponseBody getBody() {
        return this.body;
    }

}
