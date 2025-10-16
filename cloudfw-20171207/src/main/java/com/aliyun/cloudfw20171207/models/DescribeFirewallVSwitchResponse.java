// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallVSwitchResponseBody body;

    public static DescribeFirewallVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallVSwitchResponse self = new DescribeFirewallVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallVSwitchResponse setBody(DescribeFirewallVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallVSwitchResponseBody getBody() {
        return this.body;
    }

}
