// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckClusterConnectorResponseBody body;

    public static DescribeAckClusterConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorResponse self = new DescribeAckClusterConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckClusterConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckClusterConnectorResponse setBody(DescribeAckClusterConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckClusterConnectorResponseBody getBody() {
        return this.body;
    }

}
