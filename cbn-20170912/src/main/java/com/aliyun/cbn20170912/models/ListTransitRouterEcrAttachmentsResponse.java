// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterEcrAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterEcrAttachmentsResponseBody body;

    public static ListTransitRouterEcrAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterEcrAttachmentsResponse self = new ListTransitRouterEcrAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterEcrAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterEcrAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterEcrAttachmentsResponse setBody(ListTransitRouterEcrAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterEcrAttachmentsResponseBody getBody() {
        return this.body;
    }

}
