// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckControlPlaneLogEnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckControlPlaneLogEnableResponseBody body;

    public static CheckControlPlaneLogEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckControlPlaneLogEnableResponse self = new CheckControlPlaneLogEnableResponse();
        return TeaModel.build(map, self);
    }

    public CheckControlPlaneLogEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckControlPlaneLogEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckControlPlaneLogEnableResponse setBody(CheckControlPlaneLogEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckControlPlaneLogEnableResponseBody getBody() {
        return this.body;
    }

}
