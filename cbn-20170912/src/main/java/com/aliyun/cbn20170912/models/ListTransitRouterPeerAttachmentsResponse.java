// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTransitRouterPeerAttachmentsResponseBody body;

    public static ListTransitRouterPeerAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPeerAttachmentsResponse self = new ListTransitRouterPeerAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPeerAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterPeerAttachmentsResponse setBody(ListTransitRouterPeerAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterPeerAttachmentsResponseBody getBody() {
        return this.body;
    }

}
