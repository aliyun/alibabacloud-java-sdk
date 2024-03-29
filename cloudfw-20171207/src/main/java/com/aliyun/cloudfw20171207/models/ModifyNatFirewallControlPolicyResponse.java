// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNatFirewallControlPolicyResponseBody body;

    public static ModifyNatFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyResponse self = new ModifyNatFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatFirewallControlPolicyResponse setBody(ModifyNatFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
