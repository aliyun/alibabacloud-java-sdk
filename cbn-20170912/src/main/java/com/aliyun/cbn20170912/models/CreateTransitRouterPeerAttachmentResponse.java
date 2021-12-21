// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransitRouterPeerAttachmentResponseBody body;

    public static CreateTransitRouterPeerAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPeerAttachmentResponse self = new CreateTransitRouterPeerAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPeerAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterPeerAttachmentResponse setBody(CreateTransitRouterPeerAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

}
