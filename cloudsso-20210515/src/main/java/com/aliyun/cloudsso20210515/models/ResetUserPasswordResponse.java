// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetUserPasswordResponseBody body;

    public static ResetUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponse self = new ResetUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetUserPasswordResponse setBody(ResetUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserPasswordResponseBody getBody() {
        return this.body;
    }

}
