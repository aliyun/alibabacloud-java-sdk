// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterShardNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterShardNumberResponseBody body;

    public static DescribeDBClusterShardNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterShardNumberResponse self = new DescribeDBClusterShardNumberResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterShardNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterShardNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterShardNumberResponse setBody(DescribeDBClusterShardNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterShardNumberResponseBody getBody() {
        return this.body;
    }

}
