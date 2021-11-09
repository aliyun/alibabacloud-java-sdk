// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpcFirewallDefaultIPSConfigResponseBody body;

    public static ModifyVpcFirewallDefaultIPSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallDefaultIPSConfigResponse self = new ModifyVpcFirewallDefaultIPSConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallDefaultIPSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcFirewallDefaultIPSConfigResponse setBody(ModifyVpcFirewallDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
