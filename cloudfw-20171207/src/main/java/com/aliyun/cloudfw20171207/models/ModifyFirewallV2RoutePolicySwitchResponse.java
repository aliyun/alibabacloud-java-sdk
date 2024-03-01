// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyFirewallV2RoutePolicySwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFirewallV2RoutePolicySwitchResponseBody body;

    public static ModifyFirewallV2RoutePolicySwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallV2RoutePolicySwitchResponse self = new ModifyFirewallV2RoutePolicySwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallV2RoutePolicySwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFirewallV2RoutePolicySwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFirewallV2RoutePolicySwitchResponse setBody(ModifyFirewallV2RoutePolicySwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFirewallV2RoutePolicySwitchResponseBody getBody() {
        return this.body;
    }

}
