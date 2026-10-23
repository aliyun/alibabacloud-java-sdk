// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCapacityReservationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTransitRouterCapacityReservationsResponseBody body;

    public static ModifyTransitRouterCapacityReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCapacityReservationsResponse self = new ModifyTransitRouterCapacityReservationsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCapacityReservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTransitRouterCapacityReservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTransitRouterCapacityReservationsResponse setBody(ModifyTransitRouterCapacityReservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTransitRouterCapacityReservationsResponseBody getBody() {
        return this.body;
    }

}
