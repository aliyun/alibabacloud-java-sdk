// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallDropTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallDropTrafficTrendResponseBody body;

    public static DescribeNatFirewallDropTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallDropTrafficTrendResponse self = new DescribeNatFirewallDropTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallDropTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallDropTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallDropTrafficTrendResponse setBody(DescribeNatFirewallDropTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallDropTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
