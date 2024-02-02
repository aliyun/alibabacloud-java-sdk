// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignOutGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SignOutGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignOutGroupResponse setBody(SignOutGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SignOutGroupResponseBody getBody() {
        return this.body;
    }

}
