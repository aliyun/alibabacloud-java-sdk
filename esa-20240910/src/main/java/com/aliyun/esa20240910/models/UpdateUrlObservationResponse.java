// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUrlObservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUrlObservationResponseBody body;

    public static UpdateUrlObservationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUrlObservationResponse self = new UpdateUrlObservationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUrlObservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUrlObservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUrlObservationResponse setBody(UpdateUrlObservationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUrlObservationResponseBody getBody() {
        return this.body;
    }

}
