// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteReservationDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteReservationDemandResponseBody body;

    public static DeleteReservationDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReservationDemandResponse self = new DeleteReservationDemandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReservationDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReservationDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReservationDemandResponse setBody(DeleteReservationDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReservationDemandResponseBody getBody() {
        return this.body;
    }

}
