// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyPositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyVpcFirewallControlPolicyPositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallControlPolicyPositionResponse setBody(ModifyVpcFirewallControlPolicyPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

}
