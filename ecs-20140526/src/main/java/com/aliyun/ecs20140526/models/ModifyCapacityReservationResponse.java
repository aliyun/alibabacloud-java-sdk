// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCapacityReservationResponseBody body;

    public static ModifyCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCapacityReservationResponse self = new ModifyCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCapacityReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCapacityReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCapacityReservationResponse setBody(ModifyCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
