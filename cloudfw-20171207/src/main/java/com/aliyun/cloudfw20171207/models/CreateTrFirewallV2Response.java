// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrFirewallV2ResponseBody body;

    public static CreateTrFirewallV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2Response self = new CreateTrFirewallV2Response();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrFirewallV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrFirewallV2Response setBody(CreateTrFirewallV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrFirewallV2ResponseBody getBody() {
        return this.body;
    }

}
