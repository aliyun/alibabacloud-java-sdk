// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsDBPasswdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDrdsDBPasswdResponseBody body;

    public static ModifyDrdsDBPasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsDBPasswdResponse self = new ModifyDrdsDBPasswdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsDBPasswdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDrdsDBPasswdResponse setBody(ModifyDrdsDBPasswdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDrdsDBPasswdResponseBody getBody() {
        return this.body;
    }

}
