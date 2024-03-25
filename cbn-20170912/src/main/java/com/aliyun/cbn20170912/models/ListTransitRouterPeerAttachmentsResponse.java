// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListTransitRouterPeerAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterPeerAttachmentsResponse setBody(ListTransitRouterPeerAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterPeerAttachmentsResponseBody getBody() {
        return this.body;
    }

}
