// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class MigrateDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateDBClusterResponseBody body;

    public static MigrateDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBClusterResponse self = new MigrateDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public MigrateDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateDBClusterResponse setBody(MigrateDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDBClusterResponseBody getBody() {
        return this.body;
    }

}
