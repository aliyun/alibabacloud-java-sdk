// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnlockUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockUserResponseBody body;

    public static UnlockUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockUserResponse self = new UnlockUserResponse();
        return TeaModel.build(map, self);
    }

    public UnlockUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockUserResponse setBody(UnlockUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockUserResponseBody getBody() {
        return this.body;
    }

}
