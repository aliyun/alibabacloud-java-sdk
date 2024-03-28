// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomRoutingEndpointResponseBody body;

    public static DescribeCustomRoutingEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointResponse self = new DescribeCustomRoutingEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomRoutingEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomRoutingEndpointResponse setBody(DescribeCustomRoutingEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomRoutingEndpointResponseBody getBody() {
        return this.body;
    }

}
