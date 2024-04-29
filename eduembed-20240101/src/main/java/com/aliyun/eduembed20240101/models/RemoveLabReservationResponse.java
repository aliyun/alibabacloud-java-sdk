// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class RemoveLabReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveLabReservationResponseBody body;

    public static RemoveLabReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLabReservationResponse self = new RemoveLabReservationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLabReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLabReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveLabReservationResponse setBody(RemoveLabReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLabReservationResponseBody getBody() {
        return this.body;
    }

}
