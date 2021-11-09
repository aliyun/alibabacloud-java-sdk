// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcFirewallCenDetailResponseBody body;

    public static DescribeVpcFirewallCenDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenDetailResponse self = new DescribeVpcFirewallCenDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallCenDetailResponse setBody(DescribeVpcFirewallCenDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallCenDetailResponseBody getBody() {
        return this.body;
    }

}
