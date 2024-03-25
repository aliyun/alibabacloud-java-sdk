// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVpcAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteTransitRouterVpcAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterVpcAttachmentResponse setBody(DeleteTransitRouterVpcAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterVpcAttachmentResponseBody getBody() {
        return this.body;
    }

}
