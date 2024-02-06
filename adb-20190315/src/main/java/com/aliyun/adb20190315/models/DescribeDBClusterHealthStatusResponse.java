// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterHealthStatusResponseBody body;

    public static DescribeDBClusterHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterHealthStatusResponse self = new DescribeDBClusterHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterHealthStatusResponse setBody(DescribeDBClusterHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterHealthStatusResponseBody getBody() {
        return this.body;
    }

}
