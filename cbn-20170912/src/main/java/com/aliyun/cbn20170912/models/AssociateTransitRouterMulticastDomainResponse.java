// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AssociateTransitRouterMulticastDomainResponse setBody(AssociateTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
