// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class RetryMmsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryMmsTaskResponseBody body;

    public static RetryMmsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMmsTaskResponse self = new RetryMmsTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryMmsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryMmsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryMmsTaskResponse setBody(RetryMmsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryMmsTaskResponseBody getBody() {
        return this.body;
    }

}
