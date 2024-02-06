// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeLoadBalancerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancerAttributeResponse setBody(DescribeLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
