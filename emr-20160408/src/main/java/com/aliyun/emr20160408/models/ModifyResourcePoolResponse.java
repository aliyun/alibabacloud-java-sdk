// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourcePoolResponseBody body;

    public static ModifyResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePoolResponse self = new ModifyResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourcePoolResponse setBody(ModifyResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourcePoolResponseBody getBody() {
        return this.body;
    }

}
