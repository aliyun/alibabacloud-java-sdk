// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandPreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitHotExpandPreCheckTaskResponseBody body;

    public static SubmitHotExpandPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandPreCheckTaskResponse self = new SubmitHotExpandPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandPreCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHotExpandPreCheckTaskResponse setBody(SubmitHotExpandPreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHotExpandPreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
