// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPrecheckDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallPrecheckDetailResponseBody body;

    public static DescribeVpcFirewallPrecheckDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPrecheckDetailResponse self = new DescribeVpcFirewallPrecheckDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPrecheckDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallPrecheckDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallPrecheckDetailResponse setBody(DescribeVpcFirewallPrecheckDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallPrecheckDetailResponseBody getBody() {
        return this.body;
    }

}
