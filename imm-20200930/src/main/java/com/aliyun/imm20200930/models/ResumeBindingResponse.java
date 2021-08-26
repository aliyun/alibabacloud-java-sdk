// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeBindingResponseBody body;

    public static ResumeBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeBindingResponse self = new ResumeBindingResponse();
        return TeaModel.build(map, self);
    }

    public ResumeBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeBindingResponse setBody(ResumeBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeBindingResponseBody getBody() {
        return this.body;
    }

}
