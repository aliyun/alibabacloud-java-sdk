// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallAclGroupListResponseBody body;

    public static DescribeVpcFirewallAclGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAclGroupListResponse self = new DescribeVpcFirewallAclGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAclGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallAclGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallAclGroupListResponse setBody(DescribeVpcFirewallAclGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallAclGroupListResponseBody getBody() {
        return this.body;
    }

}
