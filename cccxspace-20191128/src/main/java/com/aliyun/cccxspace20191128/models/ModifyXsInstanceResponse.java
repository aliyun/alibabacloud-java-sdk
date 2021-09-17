// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ModifyXsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyXsInstanceResponseBody body;

    public static ModifyXsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyXsInstanceResponse self = new ModifyXsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyXsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyXsInstanceResponse setBody(ModifyXsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyXsInstanceResponseBody getBody() {
        return this.body;
    }

}
