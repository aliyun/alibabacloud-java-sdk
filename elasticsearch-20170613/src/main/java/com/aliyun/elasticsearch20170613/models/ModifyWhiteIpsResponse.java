// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWhiteIpsResponseBody body;

    public static ModifyWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsResponse self = new ModifyWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWhiteIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWhiteIpsResponse setBody(ModifyWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
