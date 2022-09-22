// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigratableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMigratableInstancesResponseBody body;

    public static ModifyMigratableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigratableInstancesResponse self = new ModifyMigratableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMigratableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMigratableInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMigratableInstancesResponse setBody(ModifyMigratableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMigratableInstancesResponseBody getBody() {
        return this.body;
    }

}
