// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpnAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterVpnAttachmentsResponseBody body;

    public static ListTransitRouterVpnAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVpnAttachmentsResponse self = new ListTransitRouterVpnAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVpnAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterVpnAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterVpnAttachmentsResponse setBody(ListTransitRouterVpnAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterVpnAttachmentsResponseBody getBody() {
        return this.body;
    }

}
