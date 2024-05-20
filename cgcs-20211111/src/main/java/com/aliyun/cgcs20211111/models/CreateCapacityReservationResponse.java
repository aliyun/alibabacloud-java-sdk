// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCapacityReservationResponseBody body;

    public static CreateCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationResponse self = new CreateCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCapacityReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCapacityReservationResponse setBody(CreateCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
