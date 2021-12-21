// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTransitRouterVpcAttachmentAttributeResponseBody body;

    public static UpdateTransitRouterVpcAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentAttributeResponse self = new UpdateTransitRouterVpcAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterVpcAttachmentAttributeResponse setBody(UpdateTransitRouterVpcAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterVpcAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
