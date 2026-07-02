// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallTrafficTrendResponseBody body;

    public static DescribeFirewallTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTrafficTrendResponse self = new DescribeFirewallTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallTrafficTrendResponse setBody(DescribeFirewallTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
