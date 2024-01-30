// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHealthCheckUrlResponseBody body;

    public static UpdateHealthCheckUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckUrlResponse self = new UpdateHealthCheckUrlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHealthCheckUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHealthCheckUrlResponse setBody(UpdateHealthCheckUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHealthCheckUrlResponseBody getBody() {
        return this.body;
    }

}
