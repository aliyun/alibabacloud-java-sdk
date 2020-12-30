// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyUIAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUIAccountPasswordResponseBody body;

    public static ModifyUIAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUIAccountPasswordResponse self = new ModifyUIAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUIAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUIAccountPasswordResponse setBody(ModifyUIAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUIAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
