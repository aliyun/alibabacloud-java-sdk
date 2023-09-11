// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeLogStoreOfEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogStoreOfEndpointGroupResponseBody body;

    public static DescribeLogStoreOfEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreOfEndpointGroupResponse self = new DescribeLogStoreOfEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreOfEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreOfEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogStoreOfEndpointGroupResponse setBody(DescribeLogStoreOfEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreOfEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
