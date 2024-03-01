// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallIPSWhitelistResponseBody body;

    public static DescribeVpcFirewallIPSWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallIPSWhitelistResponse self = new DescribeVpcFirewallIPSWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallIPSWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallIPSWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallIPSWhitelistResponse setBody(DescribeVpcFirewallIPSWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallIPSWhitelistResponseBody getBody() {
        return this.body;
    }

}
