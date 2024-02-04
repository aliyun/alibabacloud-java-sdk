// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBClusterAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterAccessWhiteListResponse setBody(ModifyDBClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
