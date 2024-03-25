// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterPrefixListAssociationResponseBody body;

    public static ListTransitRouterPrefixListAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPrefixListAssociationResponse self = new ListTransitRouterPrefixListAssociationResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPrefixListAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterPrefixListAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterPrefixListAssociationResponse setBody(ListTransitRouterPrefixListAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterPrefixListAssociationResponseBody getBody() {
        return this.body;
    }

}
