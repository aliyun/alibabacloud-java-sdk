// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterResponseBody body;

    public static DescribeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponse self = new DescribeClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterResponse setBody(DescribeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterResponseBody getBody() {
        return this.body;
    }

}
