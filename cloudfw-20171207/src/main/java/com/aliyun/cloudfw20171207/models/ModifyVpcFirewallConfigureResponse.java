// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyVpcFirewallConfigureResponse setBody(ModifyVpcFirewallConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

}
