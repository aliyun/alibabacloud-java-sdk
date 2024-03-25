// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTransitRouterPeerAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterPeerAttachmentResponse setBody(CreateTransitRouterPeerAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

}
