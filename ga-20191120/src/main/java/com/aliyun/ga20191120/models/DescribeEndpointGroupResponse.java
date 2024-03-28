// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEndpointGroupResponseBody body;

    public static DescribeEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointGroupResponse self = new DescribeEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEndpointGroupResponse setBody(DescribeEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
