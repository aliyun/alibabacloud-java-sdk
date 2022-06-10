// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeductUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeductUserPointResponseBody body;

    public static DeductUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeductUserPointResponse self = new DeductUserPointResponse();
        return TeaModel.build(map, self);
    }

    public DeductUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeductUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeductUserPointResponse setBody(DeductUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeductUserPointResponseBody getBody() {
        return this.body;
    }

}
