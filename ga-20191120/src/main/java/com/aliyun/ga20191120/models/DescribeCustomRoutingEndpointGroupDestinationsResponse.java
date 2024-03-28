// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody body;

    public static DescribeCustomRoutingEndpointGroupDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupDestinationsResponse self = new DescribeCustomRoutingEndpointGroupDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponse setBody(DescribeCustomRoutingEndpointGroupDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

}
