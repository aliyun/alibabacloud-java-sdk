// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class PrecheckUsabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrecheckUsabilityResponseBody body;

    public static PrecheckUsabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckUsabilityResponse self = new PrecheckUsabilityResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckUsabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckUsabilityResponse setBody(PrecheckUsabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckUsabilityResponseBody getBody() {
        return this.body;
    }

}
