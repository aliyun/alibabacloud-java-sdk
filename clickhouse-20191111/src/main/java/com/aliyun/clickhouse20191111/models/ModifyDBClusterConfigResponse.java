// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterConfigResponseBody body;

    public static ModifyDBClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigResponse self = new ModifyDBClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterConfigResponse setBody(ModifyDBClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterConfigResponseBody getBody() {
        return this.body;
    }

}
