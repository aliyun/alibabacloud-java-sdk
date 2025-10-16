// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckClustersResponseBody body;

    public static DescribeAckClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClustersResponse self = new DescribeAckClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckClustersResponse setBody(DescribeAckClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckClustersResponseBody getBody() {
        return this.body;
    }

}
