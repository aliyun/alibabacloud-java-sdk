// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterResponseBody body;

    public static ModifyDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponse self = new ModifyDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterResponse setBody(ModifyDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterResponseBody getBody() {
        return this.body;
    }

}
