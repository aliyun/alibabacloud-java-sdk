// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body;

    public static DeleteCenChildInstanceRouteEntryToAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToAttachmentResponse self = new DeleteCenChildInstanceRouteEntryToAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse setBody(DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody getBody() {
        return this.body;
    }

}
