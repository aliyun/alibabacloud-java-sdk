// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ConfirmReservationDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmReservationDemandResponseBody body;

    public static ConfirmReservationDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmReservationDemandResponse self = new ConfirmReservationDemandResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmReservationDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmReservationDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmReservationDemandResponse setBody(ConfirmReservationDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmReservationDemandResponseBody getBody() {
        return this.body;
    }

}
