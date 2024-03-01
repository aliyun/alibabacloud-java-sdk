// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetNatFirewallRuleHitCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetNatFirewallRuleHitCountResponseBody body;

    public static ResetNatFirewallRuleHitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetNatFirewallRuleHitCountResponse self = new ResetNatFirewallRuleHitCountResponse();
        return TeaModel.build(map, self);
    }

    public ResetNatFirewallRuleHitCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetNatFirewallRuleHitCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetNatFirewallRuleHitCountResponse setBody(ResetNatFirewallRuleHitCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetNatFirewallRuleHitCountResponseBody getBody() {
        return this.body;
    }

}
