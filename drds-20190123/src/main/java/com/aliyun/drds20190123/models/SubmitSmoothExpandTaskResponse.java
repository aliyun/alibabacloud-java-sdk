// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSmoothExpandTaskResponseBody body;

    public static SubmitSmoothExpandTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandTaskResponse self = new SubmitSmoothExpandTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmoothExpandTaskResponse setBody(SubmitSmoothExpandTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmoothExpandTaskResponseBody getBody() {
        return this.body;
    }

}
