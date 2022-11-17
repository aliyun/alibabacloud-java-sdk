// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TTTResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TTTResponseBody body;

    public static TTTResponse build(java.util.Map<String, ?> map) throws Exception {
        TTTResponse self = new TTTResponse();
        return TeaModel.build(map, self);
    }

    public TTTResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TTTResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TTTResponse setBody(TTTResponseBody body) {
        this.body = body;
        return this;
    }
    public TTTResponseBody getBody() {
        return this.body;
    }

}
