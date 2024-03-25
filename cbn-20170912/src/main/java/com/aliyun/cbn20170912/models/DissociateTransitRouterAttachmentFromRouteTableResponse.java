// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DissociateTransitRouterAttachmentFromRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateTransitRouterAttachmentFromRouteTableResponseBody body;

    public static DissociateTransitRouterAttachmentFromRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateTransitRouterAttachmentFromRouteTableResponse self = new DissociateTransitRouterAttachmentFromRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponse setBody(DissociateTransitRouterAttachmentFromRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateTransitRouterAttachmentFromRouteTableResponseBody getBody() {
        return this.body;
    }

}
