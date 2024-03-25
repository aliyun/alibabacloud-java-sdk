// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVpnAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterVpnAttachmentResponseBody body;

    public static DeleteTransitRouterVpnAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVpnAttachmentResponse self = new DeleteTransitRouterVpnAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVpnAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterVpnAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterVpnAttachmentResponse setBody(DeleteTransitRouterVpnAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterVpnAttachmentResponseBody getBody() {
        return this.body;
    }

}
