// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MoveCdsFileResponseBody body;

    public static MoveCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileResponse self = new MoveCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveCdsFileResponse setBody(MoveCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveCdsFileResponseBody getBody() {
        return this.body;
    }

}
