// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoadBalancerSpecResponseBody body;

    public static DescribeLoadBalancerSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerSpecResponse self = new DescribeLoadBalancerSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerSpecResponse setBody(DescribeLoadBalancerSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerSpecResponseBody getBody() {
        return this.body;
    }

}
