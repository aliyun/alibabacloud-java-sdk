// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterConnectionResponseBody body;

    public static DescribeClusterConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionResponse self = new DescribeClusterConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterConnectionResponse setBody(DescribeClusterConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterConnectionResponseBody getBody() {
        return this.body;
    }

}
