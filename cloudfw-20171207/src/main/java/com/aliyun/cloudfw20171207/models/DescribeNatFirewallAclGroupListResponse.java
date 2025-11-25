// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallAclGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallAclGroupListResponseBody body;

    public static DescribeNatFirewallAclGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallAclGroupListResponse self = new DescribeNatFirewallAclGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallAclGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallAclGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallAclGroupListResponse setBody(DescribeNatFirewallAclGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallAclGroupListResponseBody getBody() {
        return this.body;
    }

}
