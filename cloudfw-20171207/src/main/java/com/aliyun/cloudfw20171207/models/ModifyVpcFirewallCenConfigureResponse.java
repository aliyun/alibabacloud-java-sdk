// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcFirewallCenConfigureResponseBody body;

    public static ModifyVpcFirewallCenConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenConfigureResponse self = new ModifyVpcFirewallCenConfigureResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallCenConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallCenConfigureResponse setBody(ModifyVpcFirewallCenConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

}
