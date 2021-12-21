// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPeerAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteTransitRouterPeerAttachmentResponse setBody(DeleteTransitRouterPeerAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

}
