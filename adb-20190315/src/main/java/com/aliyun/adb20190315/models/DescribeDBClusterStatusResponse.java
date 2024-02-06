// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterStatusResponseBody body;

    public static DescribeDBClusterStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStatusResponse self = new DescribeDBClusterStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterStatusResponse setBody(DescribeDBClusterStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterStatusResponseBody getBody() {
        return this.body;
    }

}
