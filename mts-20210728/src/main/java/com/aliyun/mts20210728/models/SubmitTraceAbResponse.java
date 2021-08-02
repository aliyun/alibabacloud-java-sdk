// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceAbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTraceAbResponseBody body;

    public static SubmitTraceAbResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbResponse self = new SubmitTraceAbResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceAbResponse setBody(SubmitTraceAbResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceAbResponseBody getBody() {
        return this.body;
    }

}
