// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterMulticastDomainsResponseBody body;

    public static ListTransitRouterMulticastDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainsResponse self = new ListTransitRouterMulticastDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterMulticastDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterMulticastDomainsResponse setBody(ListTransitRouterMulticastDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterMulticastDomainsResponseBody getBody() {
        return this.body;
    }

}
