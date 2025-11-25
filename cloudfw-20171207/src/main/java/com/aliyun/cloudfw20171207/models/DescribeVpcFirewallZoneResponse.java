// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallZoneResponseBody body;

    public static DescribeVpcFirewallZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallZoneResponse self = new DescribeVpcFirewallZoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallZoneResponse setBody(DescribeVpcFirewallZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallZoneResponseBody getBody() {
        return this.body;
    }

}
