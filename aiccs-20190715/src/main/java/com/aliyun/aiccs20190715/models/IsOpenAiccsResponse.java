// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class IsOpenAiccsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IsOpenAiccsResponseBody body;

    public static IsOpenAiccsResponse build(java.util.Map<String, ?> map) throws Exception {
        IsOpenAiccsResponse self = new IsOpenAiccsResponse();
        return TeaModel.build(map, self);
    }

    public IsOpenAiccsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsOpenAiccsResponse setBody(IsOpenAiccsResponseBody body) {
        this.body = body;
        return this;
    }
    public IsOpenAiccsResponseBody getBody() {
        return this.body;
    }

}
