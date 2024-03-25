// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpcAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterVpcAttachmentsResponseBody body;

    public static ListTransitRouterVpcAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVpcAttachmentsResponse self = new ListTransitRouterVpcAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVpcAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterVpcAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterVpcAttachmentsResponse setBody(ListTransitRouterVpcAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterVpcAttachmentsResponseBody getBody() {
        return this.body;
    }

}
