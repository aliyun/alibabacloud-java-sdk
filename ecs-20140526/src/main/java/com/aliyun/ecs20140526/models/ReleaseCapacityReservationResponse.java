// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseCapacityReservationResponseBody body;

    public static ReleaseCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityReservationResponse self = new ReleaseCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseCapacityReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseCapacityReservationResponse setBody(ReleaseCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
