// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterStatusSetResponseBody body;

    public static DescribeDBClusterStatusSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStatusSetResponse self = new DescribeDBClusterStatusSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStatusSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterStatusSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterStatusSetResponse setBody(DescribeDBClusterStatusSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterStatusSetResponseBody getBody() {
        return this.body;
    }

}
