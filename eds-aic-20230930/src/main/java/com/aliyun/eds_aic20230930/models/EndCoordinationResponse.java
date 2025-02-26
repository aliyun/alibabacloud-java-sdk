// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class EndCoordinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndCoordinationResponseBody body;

    public static EndCoordinationResponse build(java.util.Map<String, ?> map) throws Exception {
        EndCoordinationResponse self = new EndCoordinationResponse();
        return TeaModel.build(map, self);
    }

    public EndCoordinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndCoordinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndCoordinationResponse setBody(EndCoordinationResponseBody body) {
        this.body = body;
        return this;
    }
    public EndCoordinationResponseBody getBody() {
        return this.body;
    }

}
