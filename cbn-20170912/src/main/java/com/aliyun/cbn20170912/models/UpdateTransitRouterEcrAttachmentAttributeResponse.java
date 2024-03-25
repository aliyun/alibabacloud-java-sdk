// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterEcrAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterEcrAttachmentAttributeResponseBody body;

    public static UpdateTransitRouterEcrAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterEcrAttachmentAttributeResponse self = new UpdateTransitRouterEcrAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterEcrAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterEcrAttachmentAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterEcrAttachmentAttributeResponse setBody(UpdateTransitRouterEcrAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterEcrAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
