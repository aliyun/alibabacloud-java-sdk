// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPolicyPriorUsedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNatFirewallPolicyPriorUsedResponseBody body;

    public static DescribeNatFirewallPolicyPriorUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallPolicyPriorUsedResponse self = new DescribeNatFirewallPolicyPriorUsedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallPolicyPriorUsedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallPolicyPriorUsedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallPolicyPriorUsedResponse setBody(DescribeNatFirewallPolicyPriorUsedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallPolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

}
