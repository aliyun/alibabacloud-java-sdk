// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVpcFirewallAclGroupListResponse setBody(DescribeVpcFirewallAclGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallAclGroupListResponseBody getBody() {
        return this.body;
    }

}
