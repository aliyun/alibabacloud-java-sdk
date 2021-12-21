// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransitRouterVpcAttachmentResponseBody body;

    public static CreateTransitRouterVpcAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpcAttachmentResponse self = new CreateTransitRouterVpcAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpcAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterVpcAttachmentResponse setBody(CreateTransitRouterVpcAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterVpcAttachmentResponseBody getBody() {
        return this.body;
    }

}
