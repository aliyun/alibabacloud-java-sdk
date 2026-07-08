// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallTrafficTrendResponseBody body;

    public static DescribeVpcFirewallTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficTrendResponse self = new DescribeVpcFirewallTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallTrafficTrendResponse setBody(DescribeVpcFirewallTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
