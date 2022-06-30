// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateMigrationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMigrationGroupResponseBody body;

    public static CreateMigrationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationGroupResponse self = new CreateMigrationGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMigrationGroupResponse setBody(CreateMigrationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrationGroupResponseBody getBody() {
        return this.body;
    }

}
