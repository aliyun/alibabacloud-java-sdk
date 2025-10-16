// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySensitiveSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySensitiveSwitchResponseBody body;

    public static ModifySensitiveSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySensitiveSwitchResponse self = new ModifySensitiveSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifySensitiveSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySensitiveSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySensitiveSwitchResponse setBody(ModifySensitiveSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySensitiveSwitchResponseBody getBody() {
        return this.body;
    }

}
