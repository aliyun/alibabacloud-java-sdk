// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse setBody(DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody getBody() {
        return this.body;
    }

}
