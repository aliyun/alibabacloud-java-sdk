// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterAccessWhiteListResponseBody body;

    public static ModifyDBClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListResponse self = new ModifyDBClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterAccessWhiteListResponse setBody(ModifyDBClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
