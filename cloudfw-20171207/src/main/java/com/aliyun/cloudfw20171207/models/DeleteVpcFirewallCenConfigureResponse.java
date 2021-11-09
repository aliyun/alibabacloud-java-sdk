// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallCenConfigureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpcFirewallCenConfigureResponseBody body;

    public static DeleteVpcFirewallCenConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallCenConfigureResponse self = new DeleteVpcFirewallCenConfigureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallCenConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcFirewallCenConfigureResponse setBody(DeleteVpcFirewallCenConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

}
