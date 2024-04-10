// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ResetLoginPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetLoginPasswordResponseBody body;

    public static ResetLoginPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetLoginPasswordResponse self = new ResetLoginPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetLoginPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetLoginPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetLoginPasswordResponse setBody(ResetLoginPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetLoginPasswordResponseBody getBody() {
        return this.body;
    }

}
