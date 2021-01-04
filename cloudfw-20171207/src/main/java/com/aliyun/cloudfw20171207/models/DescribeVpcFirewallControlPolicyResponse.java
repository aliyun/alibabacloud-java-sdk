// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVpcFirewallControlPolicyResponse setBody(DescribeVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
