// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ModifyMigrationObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMigrationObjectResponseBody body;

    public static ModifyMigrationObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationObjectResponse self = new ModifyMigrationObjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMigrationObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMigrationObjectResponse setBody(ModifyMigrationObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMigrationObjectResponseBody getBody() {
        return this.body;
    }

}
