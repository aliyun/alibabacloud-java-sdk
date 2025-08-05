// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenManualConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcFirewallCenManualConfigureResponseBody body;

    public static CreateVpcFirewallCenManualConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallCenManualConfigureResponse self = new CreateVpcFirewallCenManualConfigureResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallCenManualConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallCenManualConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcFirewallCenManualConfigureResponse setBody(CreateVpcFirewallCenManualConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallCenManualConfigureResponseBody getBody() {
        return this.body;
    }

}
