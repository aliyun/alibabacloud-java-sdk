// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpcFirewallControlPolicyResponseBody body;

    public static ModifyVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyResponse self = new ModifyVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallControlPolicyResponse setBody(ModifyVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
