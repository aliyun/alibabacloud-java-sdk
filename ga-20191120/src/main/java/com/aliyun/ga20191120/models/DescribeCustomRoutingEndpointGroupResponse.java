// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomRoutingEndpointGroupResponseBody body;

    public static DescribeCustomRoutingEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupResponse self = new DescribeCustomRoutingEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomRoutingEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomRoutingEndpointGroupResponse setBody(DescribeCustomRoutingEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomRoutingEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
