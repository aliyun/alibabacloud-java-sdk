// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeLoadBalancerSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancerSpecResponse setBody(DescribeLoadBalancerSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerSpecResponseBody getBody() {
        return this.body;
    }

}
