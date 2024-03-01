// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPolicyPriorUsedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallPolicyPriorUsedResponseBody body;

    public static DescribeVpcFirewallPolicyPriorUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPolicyPriorUsedResponse self = new DescribeVpcFirewallPolicyPriorUsedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse setBody(DescribeVpcFirewallPolicyPriorUsedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallPolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

}
