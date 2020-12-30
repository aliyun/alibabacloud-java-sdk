// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitSmoothExpandPreCheckTaskResponse setBody(SubmitSmoothExpandPreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmoothExpandPreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
