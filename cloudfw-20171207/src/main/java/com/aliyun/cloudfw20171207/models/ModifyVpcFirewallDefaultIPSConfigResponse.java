// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyVpcFirewallDefaultIPSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcFirewallDefaultIPSConfigResponse setBody(ModifyVpcFirewallDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcFirewallDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
