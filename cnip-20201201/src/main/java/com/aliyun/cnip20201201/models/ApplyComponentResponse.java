// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyComponentResponseBody body;

    public static ApplyComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyComponentResponse self = new ApplyComponentResponse();
        return TeaModel.build(map, self);
    }

    public ApplyComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyComponentResponse setBody(ApplyComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyComponentResponseBody getBody() {
        return this.body;
    }

}
