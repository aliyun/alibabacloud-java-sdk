// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTransitRouterVpcAttachmentZonesResponseBody body;

    public static UpdateTransitRouterVpcAttachmentZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentZonesResponse self = new UpdateTransitRouterVpcAttachmentZonesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterVpcAttachmentZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterVpcAttachmentZonesResponse setBody(UpdateTransitRouterVpcAttachmentZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterVpcAttachmentZonesResponseBody getBody() {
        return this.body;
    }

}
