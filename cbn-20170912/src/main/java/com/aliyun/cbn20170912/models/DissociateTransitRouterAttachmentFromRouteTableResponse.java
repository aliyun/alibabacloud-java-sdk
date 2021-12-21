// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DissociateTransitRouterAttachmentFromRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DissociateTransitRouterAttachmentFromRouteTableResponse setBody(DissociateTransitRouterAttachmentFromRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateTransitRouterAttachmentFromRouteTableResponseBody getBody() {
        return this.body;
    }

}
