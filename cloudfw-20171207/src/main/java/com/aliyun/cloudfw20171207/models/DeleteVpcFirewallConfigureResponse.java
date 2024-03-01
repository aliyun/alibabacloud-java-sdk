// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVpcFirewallConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcFirewallConfigureResponse setBody(DeleteVpcFirewallConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

}
