// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNatFirewallControlPolicyResponseBody body;

    public static DescribeNatFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallControlPolicyResponse self = new DescribeNatFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallControlPolicyResponse setBody(DescribeNatFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
