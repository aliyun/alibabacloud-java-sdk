// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisassociateTransitRouterPolicyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateTransitRouterPolicyTableResponseBody body;

    public static DisassociateTransitRouterPolicyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateTransitRouterPolicyTableResponse self = new DisassociateTransitRouterPolicyTableResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateTransitRouterPolicyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateTransitRouterPolicyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateTransitRouterPolicyTableResponse setBody(DisassociateTransitRouterPolicyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateTransitRouterPolicyTableResponseBody getBody() {
        return this.body;
    }

}
