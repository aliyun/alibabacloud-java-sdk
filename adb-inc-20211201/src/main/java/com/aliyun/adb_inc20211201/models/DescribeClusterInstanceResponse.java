// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterInstanceResponseBody body;

    public static DescribeClusterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInstanceResponse self = new DescribeClusterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterInstanceResponse setBody(DescribeClusterInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterInstanceResponseBody getBody() {
        return this.body;
    }

}
