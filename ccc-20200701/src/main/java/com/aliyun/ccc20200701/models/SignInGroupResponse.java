// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignInGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SignInGroupResponseBody body;

    public static SignInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SignInGroupResponse self = new SignInGroupResponse();
        return TeaModel.build(map, self);
    }

    public SignInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignInGroupResponse setBody(SignInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SignInGroupResponseBody getBody() {
        return this.body;
    }

}
