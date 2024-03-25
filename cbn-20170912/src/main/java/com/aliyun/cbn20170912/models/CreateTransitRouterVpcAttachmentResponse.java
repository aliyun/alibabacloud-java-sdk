// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTransitRouterVpcAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterVpcAttachmentResponse setBody(CreateTransitRouterVpcAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterVpcAttachmentResponseBody getBody() {
        return this.body;
    }

}
