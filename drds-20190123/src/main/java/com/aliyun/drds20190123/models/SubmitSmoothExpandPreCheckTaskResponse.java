// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSmoothExpandPreCheckTaskResponseBody body;

    public static SubmitSmoothExpandPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckTaskResponse self = new SubmitSmoothExpandPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmoothExpandPreCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmoothExpandPreCheckTaskResponse setBody(SubmitSmoothExpandPreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmoothExpandPreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
