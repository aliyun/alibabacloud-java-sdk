// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCenChildInstanceRouteEntryToAttachmentResponseBody body;

    public static CreateCenChildInstanceRouteEntryToAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToAttachmentResponse self = new CreateCenChildInstanceRouteEntryToAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentResponse setBody(CreateCenChildInstanceRouteEntryToAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenChildInstanceRouteEntryToAttachmentResponseBody getBody() {
        return this.body;
    }

}
