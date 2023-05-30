// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2ConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrFirewallV2ConfigurationResponseBody body;

    public static ModifyTrFirewallV2ConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2ConfigurationResponse self = new ModifyTrFirewallV2ConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2ConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrFirewallV2ConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrFirewallV2ConfigurationResponse setBody(ModifyTrFirewallV2ConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrFirewallV2ConfigurationResponseBody getBody() {
        return this.body;
    }

}
