// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVpcFirewallDefaultIPSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponse setBody(DescribeVpcFirewallDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
