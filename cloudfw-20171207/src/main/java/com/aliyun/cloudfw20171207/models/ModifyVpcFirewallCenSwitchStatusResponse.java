// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenSwitchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcFirewallCenSwitchStatusResponseBody body;

    public static ModifyVpcFirewallCenSwitchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenSwitchStatusResponse self = new ModifyVpcFirewallCenSwitchStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenSwitchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallCenSwitchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallCenSwitchStatusResponse setBody(ModifyVpcFirewallCenSwitchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallCenSwitchStatusResponseBody getBody() {
        return this.body;
    }

}
