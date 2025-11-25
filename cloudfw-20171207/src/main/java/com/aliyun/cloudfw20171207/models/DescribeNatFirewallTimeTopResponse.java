// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTimeTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallTimeTopResponseBody body;

    public static DescribeNatFirewallTimeTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTimeTopResponse self = new DescribeNatFirewallTimeTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTimeTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallTimeTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallTimeTopResponse setBody(DescribeNatFirewallTimeTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallTimeTopResponseBody getBody() {
        return this.body;
    }

}
