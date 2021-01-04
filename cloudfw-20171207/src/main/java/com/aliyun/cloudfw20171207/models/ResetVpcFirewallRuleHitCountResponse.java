// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetVpcFirewallRuleHitCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetVpcFirewallRuleHitCountResponseBody body;

    public static ResetVpcFirewallRuleHitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetVpcFirewallRuleHitCountResponse self = new ResetVpcFirewallRuleHitCountResponse();
        return TeaModel.build(map, self);
    }

    public ResetVpcFirewallRuleHitCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetVpcFirewallRuleHitCountResponse setBody(ResetVpcFirewallRuleHitCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetVpcFirewallRuleHitCountResponseBody getBody() {
        return this.body;
    }

}
