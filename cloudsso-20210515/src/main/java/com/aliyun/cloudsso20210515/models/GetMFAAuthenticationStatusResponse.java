// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMFAAuthenticationStatusResponseBody body;

    public static GetMFAAuthenticationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationStatusResponse self = new GetMFAAuthenticationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMFAAuthenticationStatusResponse setBody(GetMFAAuthenticationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

}
