// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUrlObservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUrlObservationResponseBody body;

    public static DeleteUrlObservationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrlObservationResponse self = new DeleteUrlObservationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUrlObservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUrlObservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUrlObservationResponse setBody(DeleteUrlObservationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUrlObservationResponseBody getBody() {
        return this.body;
    }

}
