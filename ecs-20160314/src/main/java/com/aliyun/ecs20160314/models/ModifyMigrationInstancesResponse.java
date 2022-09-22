// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigrationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMigrationInstancesResponseBody body;

    public static ModifyMigrationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationInstancesResponse self = new ModifyMigrationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMigrationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMigrationInstancesResponse setBody(ModifyMigrationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMigrationInstancesResponseBody getBody() {
        return this.body;
    }

}
