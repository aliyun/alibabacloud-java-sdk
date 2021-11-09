// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpcFirewallCenConfigureResponseBody body;

    public static CreateVpcFirewallCenConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallCenConfigureResponse self = new CreateVpcFirewallCenConfigureResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallCenConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallCenConfigureResponse setBody(CreateVpcFirewallCenConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

}
