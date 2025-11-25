// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallManualVSwitchListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallManualVSwitchListResponseBody body;

    public static DescribeVpcFirewallManualVSwitchListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallManualVSwitchListResponse self = new DescribeVpcFirewallManualVSwitchListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallManualVSwitchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallManualVSwitchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallManualVSwitchListResponse setBody(DescribeVpcFirewallManualVSwitchListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallManualVSwitchListResponseBody getBody() {
        return this.body;
    }

}
