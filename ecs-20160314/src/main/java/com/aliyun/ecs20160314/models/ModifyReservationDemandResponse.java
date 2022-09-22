// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyReservationDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyReservationDemandResponseBody body;

    public static ModifyReservationDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservationDemandResponse self = new ModifyReservationDemandResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReservationDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReservationDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReservationDemandResponse setBody(ModifyReservationDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReservationDemandResponseBody getBody() {
        return this.body;
    }

}
