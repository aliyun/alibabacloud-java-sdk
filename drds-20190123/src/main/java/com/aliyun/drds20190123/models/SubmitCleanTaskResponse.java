// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitCleanTaskResponse setBody(SubmitCleanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCleanTaskResponseBody getBody() {
        return this.body;
    }

}
