// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitHotExpandTaskResponseBody body;

    public static SubmitHotExpandTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandTaskResponse self = new SubmitHotExpandTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHotExpandTaskResponse setBody(SubmitHotExpandTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHotExpandTaskResponseBody getBody() {
        return this.body;
    }

}
