// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLabReservationResponseBody body;

    public static CreateLabReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabReservationResponse self = new CreateLabReservationResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabReservationResponse setBody(CreateLabReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabReservationResponseBody getBody() {
        return this.body;
    }

}
