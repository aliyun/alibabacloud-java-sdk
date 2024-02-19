// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterNodeResponseBody body;

    public static DescribeDBClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodeResponse self = new DescribeDBClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterNodeResponse setBody(DescribeDBClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterNodeResponseBody getBody() {
        return this.body;
    }

}
