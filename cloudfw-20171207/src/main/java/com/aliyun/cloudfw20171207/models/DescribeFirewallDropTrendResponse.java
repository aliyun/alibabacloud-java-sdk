// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallDropTrendResponseBody body;

    public static DescribeFirewallDropTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallDropTrendResponse self = new DescribeFirewallDropTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallDropTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallDropTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallDropTrendResponse setBody(DescribeFirewallDropTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallDropTrendResponseBody getBody() {
        return this.body;
    }

}
