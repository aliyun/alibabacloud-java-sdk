// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterAttachmentWithRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateTransitRouterAttachmentWithRouteTableResponseBody body;

    public static AssociateTransitRouterAttachmentWithRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterAttachmentWithRouteTableResponse self = new AssociateTransitRouterAttachmentWithRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponse setBody(AssociateTransitRouterAttachmentWithRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTransitRouterAttachmentWithRouteTableResponseBody getBody() {
        return this.body;
    }

}
