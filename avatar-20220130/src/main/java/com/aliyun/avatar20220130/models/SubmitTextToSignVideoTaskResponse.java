// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextToSignVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTextToSignVideoTaskResponseBody body;

    public static SubmitTextToSignVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextToSignVideoTaskResponse self = new SubmitTextToSignVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTextToSignVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTextToSignVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTextToSignVideoTaskResponse setBody(SubmitTextToSignVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTextToSignVideoTaskResponseBody getBody() {
        return this.body;
    }

}
