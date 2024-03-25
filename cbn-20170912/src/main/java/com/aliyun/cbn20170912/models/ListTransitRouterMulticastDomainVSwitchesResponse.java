// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainVSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterMulticastDomainVSwitchesResponseBody body;

    public static ListTransitRouterMulticastDomainVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainVSwitchesResponse self = new ListTransitRouterMulticastDomainVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainVSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterMulticastDomainVSwitchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterMulticastDomainVSwitchesResponse setBody(ListTransitRouterMulticastDomainVSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterMulticastDomainVSwitchesResponseBody getBody() {
        return this.body;
    }

}
