// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEndpointGroupResponse setBody(DescribeEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
