// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTracemuResponseBody body;

    public static SubmitTracemuResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTracemuResponse self = new SubmitTracemuResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTracemuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTracemuResponse setBody(SubmitTracemuResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTracemuResponseBody getBody() {
        return this.body;
    }

}
