// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeConnectableClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConnectableClustersResponseBody body;

    public static DescribeConnectableClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectableClustersResponse self = new DescribeConnectableClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectableClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectableClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConnectableClustersResponse setBody(DescribeConnectableClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectableClustersResponseBody getBody() {
        return this.body;
    }

}
