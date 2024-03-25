// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisassociateTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateTransitRouterMulticastDomainResponseBody body;

    public static DisassociateTransitRouterMulticastDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateTransitRouterMulticastDomainResponse self = new DisassociateTransitRouterMulticastDomainResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateTransitRouterMulticastDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateTransitRouterMulticastDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateTransitRouterMulticastDomainResponse setBody(DisassociateTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
