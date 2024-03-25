// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenChildInstanceRouteEntriesToAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCenChildInstanceRouteEntriesToAttachmentResponseBody body;

    public static ListCenChildInstanceRouteEntriesToAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCenChildInstanceRouteEntriesToAttachmentResponse self = new ListCenChildInstanceRouteEntriesToAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponse setBody(ListCenChildInstanceRouteEntriesToAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCenChildInstanceRouteEntriesToAttachmentResponseBody getBody() {
        return this.body;
    }

}
