// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectAddrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterConnectAddrsResponseBody body;

    public static DescribeClusterConnectAddrsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectAddrsResponse self = new DescribeClusterConnectAddrsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectAddrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterConnectAddrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterConnectAddrsResponse setBody(DescribeClusterConnectAddrsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBody getBody() {
        return this.body;
    }

}
