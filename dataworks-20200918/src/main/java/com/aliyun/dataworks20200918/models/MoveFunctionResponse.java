// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class MoveFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveFunctionResponseBody body;

    public static MoveFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveFunctionResponse self = new MoveFunctionResponse();
        return TeaModel.build(map, self);
    }

    public MoveFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveFunctionResponse setBody(MoveFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveFunctionResponseBody getBody() {
        return this.body;
    }

}
