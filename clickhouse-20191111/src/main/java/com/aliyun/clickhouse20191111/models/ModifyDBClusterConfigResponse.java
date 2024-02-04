// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBClusterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterConfigResponse setBody(ModifyDBClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterConfigResponseBody getBody() {
        return this.body;
    }

}
