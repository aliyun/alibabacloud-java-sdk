// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceClusterInfoResponseBody body;

    public static DescribeInstanceClusterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterInfoResponse self = new DescribeInstanceClusterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceClusterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceClusterInfoResponse setBody(DescribeInstanceClusterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceClusterInfoResponseBody getBody() {
        return this.body;
    }

}
