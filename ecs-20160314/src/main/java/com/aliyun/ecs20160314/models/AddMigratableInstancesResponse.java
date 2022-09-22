// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class AddMigratableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddMigratableInstancesResponseBody body;

    public static AddMigratableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMigratableInstancesResponse self = new AddMigratableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AddMigratableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMigratableInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMigratableInstancesResponse setBody(AddMigratableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMigratableInstancesResponseBody getBody() {
        return this.body;
    }

}
