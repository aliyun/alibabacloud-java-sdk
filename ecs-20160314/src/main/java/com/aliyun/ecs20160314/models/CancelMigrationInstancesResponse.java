// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CancelMigrationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelMigrationInstancesResponseBody body;

    public static CancelMigrationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrationInstancesResponse self = new CancelMigrationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CancelMigrationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMigrationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMigrationInstancesResponse setBody(CancelMigrationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMigrationInstancesResponseBody getBody() {
        return this.body;
    }

}
