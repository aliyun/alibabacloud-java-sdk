// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEndpointsResponseBody body;

    public static DescribeEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsResponse self = new DescribeEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEndpointsResponse setBody(DescribeEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointsResponseBody getBody() {
        return this.body;
    }

}
