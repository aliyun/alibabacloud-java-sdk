// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetUserResponseBody body;

    public static ResetUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserResponse self = new ResetUserResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetUserResponse setBody(ResetUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserResponseBody getBody() {
        return this.body;
    }

}
