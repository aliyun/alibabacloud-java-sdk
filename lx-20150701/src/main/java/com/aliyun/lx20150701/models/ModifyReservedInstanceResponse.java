// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyReservedInstanceResponseBody body;

    public static ModifyReservedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceResponse self = new ModifyReservedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReservedInstanceResponse setBody(ModifyReservedInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReservedInstanceResponseBody getBody() {
        return this.body;
    }

}
