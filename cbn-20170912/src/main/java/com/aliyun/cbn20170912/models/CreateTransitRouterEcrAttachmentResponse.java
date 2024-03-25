// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterEcrAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterEcrAttachmentResponseBody body;

    public static CreateTransitRouterEcrAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterEcrAttachmentResponse self = new CreateTransitRouterEcrAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterEcrAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterEcrAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterEcrAttachmentResponse setBody(CreateTransitRouterEcrAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterEcrAttachmentResponseBody getBody() {
        return this.body;
    }

}
