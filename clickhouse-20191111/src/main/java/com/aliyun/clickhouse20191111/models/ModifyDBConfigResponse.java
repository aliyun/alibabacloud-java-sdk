// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBConfigResponseBody body;

    public static ModifyDBConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBConfigResponse self = new ModifyDBConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBConfigResponse setBody(ModifyDBConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBConfigResponseBody getBody() {
        return this.body;
    }

}
