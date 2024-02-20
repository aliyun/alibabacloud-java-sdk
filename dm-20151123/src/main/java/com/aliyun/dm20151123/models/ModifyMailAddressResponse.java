// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMailAddressResponseBody body;

    public static ModifyMailAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMailAddressResponse self = new ModifyMailAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMailAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMailAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMailAddressResponse setBody(ModifyMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMailAddressResponseBody getBody() {
        return this.body;
    }

}
