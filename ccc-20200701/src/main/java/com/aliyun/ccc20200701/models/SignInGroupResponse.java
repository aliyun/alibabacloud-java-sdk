// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SignInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignInGroupResponse setBody(SignInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SignInGroupResponseBody getBody() {
        return this.body;
    }

}
