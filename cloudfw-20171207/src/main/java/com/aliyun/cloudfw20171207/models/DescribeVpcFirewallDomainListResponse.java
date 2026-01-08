// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallDomainListResponseBody body;

    public static DescribeVpcFirewallDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDomainListResponse self = new DescribeVpcFirewallDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallDomainListResponse setBody(DescribeVpcFirewallDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDomainListResponseBody getBody() {
        return this.body;
    }

}
