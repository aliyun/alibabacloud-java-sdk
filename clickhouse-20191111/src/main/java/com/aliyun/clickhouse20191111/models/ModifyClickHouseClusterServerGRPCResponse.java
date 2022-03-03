// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyClickHouseClusterServerGRPCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClickHouseClusterServerGRPCResponseBody body;

    public static ModifyClickHouseClusterServerGRPCResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClickHouseClusterServerGRPCResponse self = new ModifyClickHouseClusterServerGRPCResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClickHouseClusterServerGRPCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClickHouseClusterServerGRPCResponse setBody(ModifyClickHouseClusterServerGRPCResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClickHouseClusterServerGRPCResponseBody getBody() {
        return this.body;
    }

}
