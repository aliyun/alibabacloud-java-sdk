// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateCapacityReservationResponse setBody(CreateCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
