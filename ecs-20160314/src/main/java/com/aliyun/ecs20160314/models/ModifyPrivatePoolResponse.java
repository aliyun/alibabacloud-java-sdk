// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyPrivatePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrivatePoolResponseBody body;

    public static ModifyPrivatePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivatePoolResponse self = new ModifyPrivatePoolResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrivatePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrivatePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrivatePoolResponse setBody(ModifyPrivatePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrivatePoolResponseBody getBody() {
        return this.body;
    }

}
