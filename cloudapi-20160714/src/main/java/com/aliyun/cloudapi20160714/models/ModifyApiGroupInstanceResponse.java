// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApiGroupInstanceResponseBody body;

    public static ModifyApiGroupInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupInstanceResponse self = new ModifyApiGroupInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiGroupInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiGroupInstanceResponse setBody(ModifyApiGroupInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiGroupInstanceResponseBody getBody() {
        return this.body;
    }

}
