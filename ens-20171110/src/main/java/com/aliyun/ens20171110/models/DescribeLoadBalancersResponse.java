// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoadBalancersResponseBody body;

    public static DescribeLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponse self = new DescribeLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancersResponse setBody(DescribeLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
