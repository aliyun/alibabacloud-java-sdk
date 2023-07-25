// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNatFirewallControlPolicyPositionResponseBody body;

    public static ModifyNatFirewallControlPolicyPositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyPositionResponse self = new ModifyNatFirewallControlPolicyPositionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyPositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatFirewallControlPolicyPositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatFirewallControlPolicyPositionResponse setBody(ModifyNatFirewallControlPolicyPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatFirewallControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

}
