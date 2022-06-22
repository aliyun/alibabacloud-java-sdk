// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class RetryActivityTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryActivityTaskResponseBody body;

    public static RetryActivityTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryActivityTaskResponse self = new RetryActivityTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryActivityTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryActivityTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryActivityTaskResponse setBody(RetryActivityTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryActivityTaskResponseBody getBody() {
        return this.body;
    }

}
