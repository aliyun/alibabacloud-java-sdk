// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServerLoadBalancerMonitorResponseBody body;

    public static DescribeServerLoadBalancerMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerMonitorResponse self = new DescribeServerLoadBalancerMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerLoadBalancerMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerLoadBalancerMonitorResponse setBody(DescribeServerLoadBalancerMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerLoadBalancerMonitorResponseBody getBody() {
        return this.body;
    }

}
