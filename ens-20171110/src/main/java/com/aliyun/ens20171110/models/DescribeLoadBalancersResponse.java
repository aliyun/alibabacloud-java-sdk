// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLoadBalancersResponse setBody(DescribeLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
