// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallSwitchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcFirewallSwitchStatusResponseBody body;

    public static ModifyVpcFirewallSwitchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallSwitchStatusResponse self = new ModifyVpcFirewallSwitchStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallSwitchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallSwitchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallSwitchStatusResponse setBody(ModifyVpcFirewallSwitchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallSwitchStatusResponseBody getBody() {
        return this.body;
    }

}
