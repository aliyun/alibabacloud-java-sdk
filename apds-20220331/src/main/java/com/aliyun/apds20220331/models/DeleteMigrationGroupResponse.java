// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteMigrationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMigrationGroupResponseBody body;

    public static DeleteMigrationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationGroupResponse self = new DeleteMigrationGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMigrationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMigrationGroupResponse setBody(DeleteMigrationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMigrationGroupResponseBody getBody() {
        return this.body;
    }

}
