// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterInstanceResponseBody body;

    public static RegisterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceResponse self = new RegisterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterInstanceResponse setBody(RegisterInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterInstanceResponseBody getBody() {
        return this.body;
    }

}
