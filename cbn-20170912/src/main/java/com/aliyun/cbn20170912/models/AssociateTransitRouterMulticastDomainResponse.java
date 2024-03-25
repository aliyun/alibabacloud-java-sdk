// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateTransitRouterMulticastDomainResponseBody body;

    public static AssociateTransitRouterMulticastDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterMulticastDomainResponse self = new AssociateTransitRouterMulticastDomainResponse();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterMulticastDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateTransitRouterMulticastDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateTransitRouterMulticastDomainResponse setBody(AssociateTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
