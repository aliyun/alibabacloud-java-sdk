// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyImageSharePermissionResponseBody body;

    public static ModifyImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionResponse self = new ModifyImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageSharePermissionResponse setBody(ModifyImageSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageSharePermissionResponseBody getBody() {
        return this.body;
    }

}
