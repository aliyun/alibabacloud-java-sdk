// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDropTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallDropTrafficTrendResponseBody body;

    public static DescribeVpcFirewallDropTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDropTrafficTrendResponse self = new DescribeVpcFirewallDropTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDropTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallDropTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallDropTrafficTrendResponse setBody(DescribeVpcFirewallDropTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDropTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
