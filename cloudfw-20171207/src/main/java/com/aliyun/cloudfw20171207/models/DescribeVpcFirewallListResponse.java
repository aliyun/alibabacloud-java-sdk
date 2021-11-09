// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcFirewallListResponseBody body;

    public static DescribeVpcFirewallListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallListResponse self = new DescribeVpcFirewallListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallListResponse setBody(DescribeVpcFirewallListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallListResponseBody getBody() {
        return this.body;
    }

}
