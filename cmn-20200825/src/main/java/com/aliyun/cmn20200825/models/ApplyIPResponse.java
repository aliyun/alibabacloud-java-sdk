// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ApplyIPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyIPResponseBody body;

    public static ApplyIPResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyIPResponse self = new ApplyIPResponse();
        return TeaModel.build(map, self);
    }

    public ApplyIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyIPResponse setBody(ApplyIPResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyIPResponseBody getBody() {
        return this.body;
    }

}
