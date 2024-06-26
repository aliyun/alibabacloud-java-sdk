// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InviteUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InviteUserResponseBody body;

    public static InviteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteUserResponse self = new InviteUserResponse();
        return TeaModel.build(map, self);
    }

    public InviteUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InviteUserResponse setBody(InviteUserResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteUserResponseBody getBody() {
        return this.body;
    }

}
