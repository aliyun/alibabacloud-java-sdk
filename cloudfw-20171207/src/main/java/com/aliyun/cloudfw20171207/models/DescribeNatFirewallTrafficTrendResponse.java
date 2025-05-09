// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallTrafficTrendResponseBody body;

    public static DescribeNatFirewallTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTrafficTrendResponse self = new DescribeNatFirewallTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallTrafficTrendResponse setBody(DescribeNatFirewallTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
