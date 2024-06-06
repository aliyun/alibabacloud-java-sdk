// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RevokeUserSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeUserSessionResponseBody body;

    public static RevokeUserSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserSessionResponse self = new RevokeUserSessionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeUserSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeUserSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeUserSessionResponse setBody(RevokeUserSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeUserSessionResponseBody getBody() {
        return this.body;
    }

}
