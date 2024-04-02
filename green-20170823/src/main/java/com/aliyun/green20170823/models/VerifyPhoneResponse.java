// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyPhoneResponseBody body;

    public static VerifyPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneResponse self = new VerifyPhoneResponse();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyPhoneResponse setBody(VerifyPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyPhoneResponseBody getBody() {
        return this.body;
    }

}
