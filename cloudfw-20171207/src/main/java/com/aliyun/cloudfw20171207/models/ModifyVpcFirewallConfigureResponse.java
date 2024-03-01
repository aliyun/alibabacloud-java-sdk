// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcFirewallConfigureResponseBody body;

    public static ModifyVpcFirewallConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallConfigureResponse self = new ModifyVpcFirewallConfigureResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallConfigureResponse setBody(ModifyVpcFirewallConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

}
