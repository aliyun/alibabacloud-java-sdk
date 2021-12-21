// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVpcAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTransitRouterVpcAttachmentResponseBody body;

    public static DeleteTransitRouterVpcAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVpcAttachmentResponse self = new DeleteTransitRouterVpcAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVpcAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterVpcAttachmentResponse setBody(DeleteTransitRouterVpcAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterVpcAttachmentResponseBody getBody() {
        return this.body;
    }

}
