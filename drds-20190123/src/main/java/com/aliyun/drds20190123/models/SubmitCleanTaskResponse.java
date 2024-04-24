// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCleanTaskResponseBody body;

    public static SubmitCleanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCleanTaskResponse self = new SubmitCleanTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCleanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCleanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCleanTaskResponse setBody(SubmitCleanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCleanTaskResponseBody getBody() {
        return this.body;
    }

}
