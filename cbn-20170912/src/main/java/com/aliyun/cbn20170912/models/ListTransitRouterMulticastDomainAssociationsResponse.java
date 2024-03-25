// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterMulticastDomainAssociationsResponseBody body;

    public static ListTransitRouterMulticastDomainAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainAssociationsResponse self = new ListTransitRouterMulticastDomainAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterMulticastDomainAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterMulticastDomainAssociationsResponse setBody(ListTransitRouterMulticastDomainAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterMulticastDomainAssociationsResponseBody getBody() {
        return this.body;
    }

}
