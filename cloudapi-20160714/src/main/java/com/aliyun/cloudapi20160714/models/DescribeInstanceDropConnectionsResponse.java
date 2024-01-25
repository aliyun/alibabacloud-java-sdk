// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceDropConnectionsResponseBody body;

    public static DescribeInstanceDropConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropConnectionsResponse self = new DescribeInstanceDropConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDropConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDropConnectionsResponse setBody(DescribeInstanceDropConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDropConnectionsResponseBody getBody() {
        return this.body;
    }

}
