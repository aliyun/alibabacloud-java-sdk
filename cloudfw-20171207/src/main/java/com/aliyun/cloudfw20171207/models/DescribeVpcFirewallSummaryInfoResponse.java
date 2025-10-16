// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallSummaryInfoResponseBody body;

    public static DescribeVpcFirewallSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallSummaryInfoResponse self = new DescribeVpcFirewallSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallSummaryInfoResponse setBody(DescribeVpcFirewallSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
