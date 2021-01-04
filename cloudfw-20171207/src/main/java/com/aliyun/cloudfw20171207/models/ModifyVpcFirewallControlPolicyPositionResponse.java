// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyPositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpcFirewallControlPolicyPositionResponseBody body;

    public static ModifyVpcFirewallControlPolicyPositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyPositionResponse self = new ModifyVpcFirewallControlPolicyPositionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyPositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallControlPolicyPositionResponse setBody(ModifyVpcFirewallControlPolicyPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

}
