// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerListenMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServerLoadBalancerListenMonitorResponseBody body;

    public static DescribeServerLoadBalancerListenMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerListenMonitorResponse self = new DescribeServerLoadBalancerListenMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerListenMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerLoadBalancerListenMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerLoadBalancerListenMonitorResponse setBody(DescribeServerLoadBalancerListenMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerLoadBalancerListenMonitorResponseBody getBody() {
        return this.body;
    }

}
