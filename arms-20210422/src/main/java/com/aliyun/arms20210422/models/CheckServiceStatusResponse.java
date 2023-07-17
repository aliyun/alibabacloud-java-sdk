// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceStatusResponseBody body;

    public static CheckServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceStatusResponse self = new CheckServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceStatusResponse setBody(CheckServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceStatusResponseBody getBody() {
        return this.body;
    }

}
