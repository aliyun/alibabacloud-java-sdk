// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPrecheckDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallPrecheckDetailResponseBody body;

    public static DescribeNatFirewallPrecheckDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallPrecheckDetailResponse self = new DescribeNatFirewallPrecheckDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallPrecheckDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallPrecheckDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallPrecheckDetailResponse setBody(DescribeNatFirewallPrecheckDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallPrecheckDetailResponseBody getBody() {
        return this.body;
    }

}
