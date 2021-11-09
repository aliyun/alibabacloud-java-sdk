// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcFirewallDetailResponseBody body;

    public static DescribeVpcFirewallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDetailResponse self = new DescribeVpcFirewallDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallDetailResponse setBody(DescribeVpcFirewallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDetailResponseBody getBody() {
        return this.body;
    }

}
