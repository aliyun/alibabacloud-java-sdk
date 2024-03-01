// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTrFirewallV2RoutePolicyScopeResponseBody body;

    public static ModifyTrFirewallV2RoutePolicyScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2RoutePolicyScopeResponse self = new ModifyTrFirewallV2RoutePolicyScopeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2RoutePolicyScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrFirewallV2RoutePolicyScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrFirewallV2RoutePolicyScopeResponse setBody(ModifyTrFirewallV2RoutePolicyScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrFirewallV2RoutePolicyScopeResponseBody getBody() {
        return this.body;
    }

}
