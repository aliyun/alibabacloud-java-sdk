// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoadBalancerAttributeResponseBody body;

    public static DescribeLoadBalancerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerAttributeResponse self = new DescribeLoadBalancerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerAttributeResponse setBody(DescribeLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
