// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPhoneNumberResponseBody body;

    public static ModifyPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberResponse self = new ModifyPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPhoneNumberResponse setBody(ModifyPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
