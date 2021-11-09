// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallConfigureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpcFirewallConfigureResponseBody body;

    public static DeleteVpcFirewallConfigureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallConfigureResponse self = new DeleteVpcFirewallConfigureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallConfigureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcFirewallConfigureResponse setBody(DeleteVpcFirewallConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

}
