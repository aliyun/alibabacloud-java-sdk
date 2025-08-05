// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDnsFirewallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDnsFirewallPolicyResponseBody body;

    public static ModifyDnsFirewallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnsFirewallPolicyResponse self = new ModifyDnsFirewallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDnsFirewallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDnsFirewallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDnsFirewallPolicyResponse setBody(ModifyDnsFirewallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDnsFirewallPolicyResponseBody getBody() {
        return this.body;
    }

}
