// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateReservationDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateReservationDemandResponseBody body;

    public static CreateReservationDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReservationDemandResponse self = new CreateReservationDemandResponse();
        return TeaModel.build(map, self);
    }

    public CreateReservationDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReservationDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReservationDemandResponse setBody(CreateReservationDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReservationDemandResponseBody getBody() {
        return this.body;
    }

}
