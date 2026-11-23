// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListRouteMapAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteMapAssociationsResponseBody body;

    public static ListRouteMapAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapAssociationsResponse self = new ListRouteMapAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteMapAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteMapAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteMapAssociationsResponse setBody(ListRouteMapAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteMapAssociationsResponseBody getBody() {
        return this.body;
    }

}
