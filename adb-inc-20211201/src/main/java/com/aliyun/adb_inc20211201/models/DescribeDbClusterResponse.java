// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbClusterResponseBody body;

    public static DescribeDbClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterResponse self = new DescribeDbClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbClusterResponse setBody(DescribeDbClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbClusterResponseBody getBody() {
        return this.body;
    }

}
