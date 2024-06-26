// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountPrivilegesResponseBody body;

    public static ModifyAccountPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegesResponse self = new ModifyAccountPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPrivilegesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountPrivilegesResponse setBody(ModifyAccountPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPrivilegesResponseBody getBody() {
        return this.body;
    }

}
