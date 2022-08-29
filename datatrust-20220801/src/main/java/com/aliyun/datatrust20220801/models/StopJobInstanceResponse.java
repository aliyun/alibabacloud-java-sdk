// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class StopJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopJobInstanceResponseBody body;

    public static StopJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopJobInstanceResponse self = new StopJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopJobInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopJobInstanceResponse setBody(StopJobInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopJobInstanceResponseBody getBody() {
        return this.body;
    }

}
