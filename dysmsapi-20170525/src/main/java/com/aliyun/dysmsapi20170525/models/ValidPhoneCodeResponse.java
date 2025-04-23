// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ValidPhoneCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidPhoneCodeResponseBody body;

    public static ValidPhoneCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidPhoneCodeResponse self = new ValidPhoneCodeResponse();
        return TeaModel.build(map, self);
    }

    public ValidPhoneCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidPhoneCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidPhoneCodeResponse setBody(ValidPhoneCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidPhoneCodeResponseBody getBody() {
        return this.body;
    }

}
