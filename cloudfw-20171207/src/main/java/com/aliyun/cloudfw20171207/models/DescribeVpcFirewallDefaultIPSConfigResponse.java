// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcFirewallDefaultIPSConfigResponseBody body;

    public static DescribeVpcFirewallDefaultIPSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDefaultIPSConfigResponse self = new DescribeVpcFirewallDefaultIPSConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDefaultIPSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponse setBody(DescribeVpcFirewallDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
