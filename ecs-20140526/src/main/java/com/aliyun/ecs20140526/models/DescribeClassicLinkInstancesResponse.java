// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClassicLinkInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClassicLinkInstancesResponseBody body;

    public static DescribeClassicLinkInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassicLinkInstancesResponse self = new DescribeClassicLinkInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClassicLinkInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClassicLinkInstancesResponse setBody(DescribeClassicLinkInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClassicLinkInstancesResponseBody getBody() {
        return this.body;
    }

}
