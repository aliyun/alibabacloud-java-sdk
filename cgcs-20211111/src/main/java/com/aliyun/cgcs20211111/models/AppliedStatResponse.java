// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppliedStatResponseBody body;

    public static AppliedStatResponse build(java.util.Map<String, ?> map) throws Exception {
        AppliedStatResponse self = new AppliedStatResponse();
        return TeaModel.build(map, self);
    }

    public AppliedStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppliedStatResponse setBody(AppliedStatResponseBody body) {
        this.body = body;
        return this;
    }
    public AppliedStatResponseBody getBody() {
        return this.body;
    }

}
