// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopClassResponseBody body;

    public static StopClassResponse build(java.util.Map<String, ?> map) throws Exception {
        StopClassResponse self = new StopClassResponse();
        return TeaModel.build(map, self);
    }

    public StopClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopClassResponse setBody(StopClassResponseBody body) {
        this.body = body;
        return this;
    }
    public StopClassResponseBody getBody() {
        return this.body;
    }

}
