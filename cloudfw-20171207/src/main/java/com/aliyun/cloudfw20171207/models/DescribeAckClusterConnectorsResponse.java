// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckClusterConnectorsResponseBody body;

    public static DescribeAckClusterConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorsResponse self = new DescribeAckClusterConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckClusterConnectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckClusterConnectorsResponse setBody(DescribeAckClusterConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckClusterConnectorsResponseBody getBody() {
        return this.body;
    }

}
