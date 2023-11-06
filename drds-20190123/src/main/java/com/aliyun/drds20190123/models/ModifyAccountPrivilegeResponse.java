// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountPrivilegeResponseBody body;

    public static ModifyAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeResponse self = new ModifyAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountPrivilegeResponse setBody(ModifyAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
