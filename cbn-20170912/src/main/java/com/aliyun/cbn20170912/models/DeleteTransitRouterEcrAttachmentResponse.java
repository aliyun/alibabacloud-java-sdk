// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterEcrAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterEcrAttachmentResponseBody body;

    public static DeleteTransitRouterEcrAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterEcrAttachmentResponse self = new DeleteTransitRouterEcrAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterEcrAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterEcrAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterEcrAttachmentResponse setBody(DeleteTransitRouterEcrAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterEcrAttachmentResponseBody getBody() {
        return this.body;
    }

}
