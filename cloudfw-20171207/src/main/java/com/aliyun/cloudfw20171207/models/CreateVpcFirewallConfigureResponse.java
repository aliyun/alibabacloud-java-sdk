// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcFirewallConfigureResponseBody body;

    public static CreateVpcFirewallConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallConfigureResponse self = new CreateVpcFirewallConfigureResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcFirewallConfigureResponse setBody(CreateVpcFirewallConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

}
