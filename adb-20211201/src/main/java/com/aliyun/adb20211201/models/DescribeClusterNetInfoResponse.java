// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterNetInfoResponseBody body;

    public static DescribeClusterNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetInfoResponse self = new DescribeClusterNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterNetInfoResponse setBody(DescribeClusterNetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNetInfoResponseBody getBody() {
        return this.body;
    }

}
