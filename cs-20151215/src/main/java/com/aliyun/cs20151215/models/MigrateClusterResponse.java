// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MigrateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateClusterResponseBody body;

    public static MigrateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateClusterResponse self = new MigrateClusterResponse();
        return TeaModel.build(map, self);
    }

    public MigrateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateClusterResponse setBody(MigrateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateClusterResponseBody getBody() {
        return this.body;
    }

}
