// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDrdsInstanceDescriptionResponseBody body;

    public static ModifyDrdsInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionResponse self = new ModifyDrdsInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDrdsInstanceDescriptionResponse setBody(ModifyDrdsInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDrdsInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
