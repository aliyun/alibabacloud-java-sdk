// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpnAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterVpnAttachmentAttributeResponseBody body;

    public static UpdateTransitRouterVpnAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpnAttachmentAttributeResponse self = new UpdateTransitRouterVpnAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpnAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterVpnAttachmentAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterVpnAttachmentAttributeResponse setBody(UpdateTransitRouterVpnAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterVpnAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
