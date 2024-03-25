// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpnAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterVpnAttachmentResponseBody body;

    public static CreateTransitRouterVpnAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpnAttachmentResponse self = new CreateTransitRouterVpnAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpnAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterVpnAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterVpnAttachmentResponse setBody(CreateTransitRouterVpnAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterVpnAttachmentResponseBody getBody() {
        return this.body;
    }

}
