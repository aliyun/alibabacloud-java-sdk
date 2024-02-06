// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoadBalancerHTTPListenerAttributeResponseBody body;

    public static DescribeLoadBalancerHTTPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPListenerAttributeResponse self = new DescribeLoadBalancerHTTPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse setBody(DescribeLoadBalancerHTTPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerHTTPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
