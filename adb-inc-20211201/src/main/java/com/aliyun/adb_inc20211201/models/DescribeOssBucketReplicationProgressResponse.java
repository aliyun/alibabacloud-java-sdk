// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssBucketReplicationProgressResponseBody body;

    public static DescribeOssBucketReplicationProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationProgressResponse self = new DescribeOssBucketReplicationProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssBucketReplicationProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssBucketReplicationProgressResponse setBody(DescribeOssBucketReplicationProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssBucketReplicationProgressResponseBody getBody() {
        return this.body;
    }

}
