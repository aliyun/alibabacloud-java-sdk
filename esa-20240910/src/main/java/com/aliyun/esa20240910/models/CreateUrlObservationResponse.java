// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUrlObservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUrlObservationResponseBody body;

    public static CreateUrlObservationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUrlObservationResponse self = new CreateUrlObservationResponse();
        return TeaModel.build(map, self);
    }

    public CreateUrlObservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUrlObservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUrlObservationResponse setBody(CreateUrlObservationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUrlObservationResponseBody getBody() {
        return this.body;
    }

}
