// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPhoneBusinessProfileResponseBody body;

    public static ModifyPhoneBusinessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileResponse self = new ModifyPhoneBusinessProfileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneBusinessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhoneBusinessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPhoneBusinessProfileResponse setBody(ModifyPhoneBusinessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhoneBusinessProfileResponseBody getBody() {
        return this.body;
    }

}
