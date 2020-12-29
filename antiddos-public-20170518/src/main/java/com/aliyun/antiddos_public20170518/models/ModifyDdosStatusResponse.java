// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDdosStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDdosStatusResponseBody body;

    public static ModifyDdosStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDdosStatusResponse self = new ModifyDdosStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDdosStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDdosStatusResponse setBody(ModifyDdosStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDdosStatusResponseBody getBody() {
        return this.body;
    }

}
