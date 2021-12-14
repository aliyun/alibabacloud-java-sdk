// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyExpandSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyExpandSpecResponseBody body;

    public static ApplyExpandSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyExpandSpecResponse self = new ApplyExpandSpecResponse();
        return TeaModel.build(map, self);
    }

    public ApplyExpandSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyExpandSpecResponse setBody(ApplyExpandSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyExpandSpecResponseBody getBody() {
        return this.body;
    }

}
