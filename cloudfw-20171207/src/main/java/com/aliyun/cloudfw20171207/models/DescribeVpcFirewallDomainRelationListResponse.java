// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDomainRelationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallDomainRelationListResponseBody body;

    public static DescribeVpcFirewallDomainRelationListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDomainRelationListResponse self = new DescribeVpcFirewallDomainRelationListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDomainRelationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallDomainRelationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallDomainRelationListResponse setBody(DescribeVpcFirewallDomainRelationListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDomainRelationListResponseBody getBody() {
        return this.body;
    }

}
