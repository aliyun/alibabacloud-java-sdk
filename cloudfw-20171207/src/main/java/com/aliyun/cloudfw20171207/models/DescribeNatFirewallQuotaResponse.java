// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallQuotaResponseBody body;

    public static DescribeNatFirewallQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallQuotaResponse self = new DescribeNatFirewallQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallQuotaResponse setBody(DescribeNatFirewallQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallQuotaResponseBody getBody() {
        return this.body;
    }

}
