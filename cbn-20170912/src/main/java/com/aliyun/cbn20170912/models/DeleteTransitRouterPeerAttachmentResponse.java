// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPeerAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterPeerAttachmentResponseBody body;

    public static DeleteTransitRouterPeerAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPeerAttachmentResponse self = new DeleteTransitRouterPeerAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPeerAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterPeerAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterPeerAttachmentResponse setBody(DeleteTransitRouterPeerAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

}
