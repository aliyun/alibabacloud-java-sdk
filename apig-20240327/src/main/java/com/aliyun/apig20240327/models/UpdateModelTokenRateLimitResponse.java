// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelTokenRateLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelTokenRateLimitResponseBody body;

    public static UpdateModelTokenRateLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTokenRateLimitResponse self = new UpdateModelTokenRateLimitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelTokenRateLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelTokenRateLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelTokenRateLimitResponse setBody(UpdateModelTokenRateLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelTokenRateLimitResponseBody getBody() {
        return this.body;
    }

}
