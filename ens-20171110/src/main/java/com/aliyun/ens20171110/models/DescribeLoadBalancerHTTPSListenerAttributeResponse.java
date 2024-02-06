// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody body;

    public static DescribeLoadBalancerHTTPSListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeResponse self = new DescribeLoadBalancerHTTPSListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse setBody(DescribeLoadBalancerHTTPSListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
