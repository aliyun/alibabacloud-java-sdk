// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrFirewallV2RoutePolicyResponseBody body;

    public static CreateTrFirewallV2RoutePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2RoutePolicyResponse self = new CreateTrFirewallV2RoutePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2RoutePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrFirewallV2RoutePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrFirewallV2RoutePolicyResponse setBody(CreateTrFirewallV2RoutePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrFirewallV2RoutePolicyResponseBody getBody() {
        return this.body;
    }

}
