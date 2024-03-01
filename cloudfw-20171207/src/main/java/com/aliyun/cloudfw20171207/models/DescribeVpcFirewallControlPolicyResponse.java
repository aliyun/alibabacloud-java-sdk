// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallControlPolicyResponseBody body;

    public static DescribeVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallControlPolicyResponse self = new DescribeVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallControlPolicyResponse setBody(DescribeVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
