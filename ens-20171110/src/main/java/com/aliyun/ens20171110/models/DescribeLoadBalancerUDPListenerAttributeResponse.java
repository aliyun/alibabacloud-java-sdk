// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerUDPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoadBalancerUDPListenerAttributeResponseBody body;

    public static DescribeLoadBalancerUDPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerUDPListenerAttributeResponse self = new DescribeLoadBalancerUDPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse setBody(DescribeLoadBalancerUDPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerUDPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
