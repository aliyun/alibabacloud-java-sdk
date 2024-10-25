// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoadBalancerListenMonitorResponseBody body;

    public static DescribeLoadBalancerListenMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenMonitorResponse self = new DescribeLoadBalancerListenMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerListenMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancerListenMonitorResponse setBody(DescribeLoadBalancerListenMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerListenMonitorResponseBody getBody() {
        return this.body;
    }

}
