// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CheckImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckImageResponseBody body;

    public static CheckImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckImageResponse self = new CheckImageResponse();
        return TeaModel.build(map, self);
    }

    public CheckImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckImageResponse setBody(CheckImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckImageResponseBody getBody() {
        return this.body;
    }

}
