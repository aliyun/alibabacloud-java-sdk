// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallIPSWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcFirewallIPSWhitelistResponseBody body;

    public static ModifyVpcFirewallIPSWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallIPSWhitelistResponse self = new ModifyVpcFirewallIPSWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallIPSWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallIPSWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallIPSWhitelistResponse setBody(ModifyVpcFirewallIPSWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallIPSWhitelistResponseBody getBody() {
        return this.body;
    }

}
