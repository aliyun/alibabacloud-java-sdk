// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteMigratableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMigratableInstancesResponseBody body;

    public static DeleteMigratableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigratableInstancesResponse self = new DeleteMigratableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMigratableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMigratableInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMigratableInstancesResponse setBody(DeleteMigratableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMigratableInstancesResponseBody getBody() {
        return this.body;
    }

}
