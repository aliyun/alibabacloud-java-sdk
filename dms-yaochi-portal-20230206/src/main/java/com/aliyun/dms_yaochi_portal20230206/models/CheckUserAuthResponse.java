// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class CheckUserAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserAuthResponseBody body;

    public static CheckUserAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAuthResponse self = new CheckUserAuthResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserAuthResponse setBody(CheckUserAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserAuthResponseBody getBody() {
        return this.body;
    }

}
