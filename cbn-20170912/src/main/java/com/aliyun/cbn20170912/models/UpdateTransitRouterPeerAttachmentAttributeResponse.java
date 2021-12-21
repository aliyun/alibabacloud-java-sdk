// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPeerAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateTransitRouterPeerAttachmentAttributeResponse setBody(UpdateTransitRouterPeerAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterPeerAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
