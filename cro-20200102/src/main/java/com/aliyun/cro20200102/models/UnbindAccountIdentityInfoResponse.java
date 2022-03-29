// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class UnbindAccountIdentityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindAccountIdentityInfoResponseBody body;

    public static UnbindAccountIdentityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountIdentityInfoResponse self = new UnbindAccountIdentityInfoResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAccountIdentityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAccountIdentityInfoResponse setBody(UnbindAccountIdentityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAccountIdentityInfoResponseBody getBody() {
        return this.body;
    }

}
