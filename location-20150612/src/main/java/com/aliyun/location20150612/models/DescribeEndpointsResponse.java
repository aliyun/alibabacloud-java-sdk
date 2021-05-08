// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEndpointsResponse setBody(DescribeEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointsResponseBody getBody() {
        return this.body;
    }

}
