// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyReadOnlyAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyReadOnlyAccountPasswordResponseBody body;

    public static ModifyReadOnlyAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadOnlyAccountPasswordResponse self = new ModifyReadOnlyAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReadOnlyAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReadOnlyAccountPasswordResponse setBody(ModifyReadOnlyAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReadOnlyAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
