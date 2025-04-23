// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class RequiredPhoneCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequiredPhoneCodeResponseBody body;

    public static RequiredPhoneCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RequiredPhoneCodeResponse self = new RequiredPhoneCodeResponse();
        return TeaModel.build(map, self);
    }

    public RequiredPhoneCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequiredPhoneCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequiredPhoneCodeResponse setBody(RequiredPhoneCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RequiredPhoneCodeResponseBody getBody() {
        return this.body;
    }

}
