// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ApplyAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyAuthorizationResponseBody body;

    public static ApplyAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAuthorizationResponse self = new ApplyAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAuthorizationResponse setBody(ApplyAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAuthorizationResponseBody getBody() {
        return this.body;
    }

}
