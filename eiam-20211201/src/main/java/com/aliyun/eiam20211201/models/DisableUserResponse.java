// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableUserResponseBody body;

    public static DisableUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableUserResponse self = new DisableUserResponse();
        return TeaModel.build(map, self);
    }

    public DisableUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableUserResponse setBody(DisableUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableUserResponseBody getBody() {
        return this.body;
    }

}
