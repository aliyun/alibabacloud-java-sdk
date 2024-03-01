// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallCenConfigureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVpcFirewallCenConfigureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcFirewallCenConfigureResponse setBody(DeleteVpcFirewallCenConfigureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

}
