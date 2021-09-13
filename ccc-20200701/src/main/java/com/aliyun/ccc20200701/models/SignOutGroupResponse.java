// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignOutGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SignOutGroupResponseBody body;

    public static SignOutGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SignOutGroupResponse self = new SignOutGroupResponse();
        return TeaModel.build(map, self);
    }

    public SignOutGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignOutGroupResponse setBody(SignOutGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SignOutGroupResponseBody getBody() {
        return this.body;
    }

}
