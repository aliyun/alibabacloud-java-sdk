// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPeerAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterPeerAttachmentAttributeResponseBody body;

    public static UpdateTransitRouterPeerAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPeerAttachmentAttributeResponse self = new UpdateTransitRouterPeerAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponse setBody(UpdateTransitRouterPeerAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterPeerAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
