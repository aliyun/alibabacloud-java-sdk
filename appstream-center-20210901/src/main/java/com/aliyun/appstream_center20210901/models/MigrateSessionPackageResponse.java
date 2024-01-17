// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class MigrateSessionPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateSessionPackageResponseBody body;

    public static MigrateSessionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateSessionPackageResponse self = new MigrateSessionPackageResponse();
        return TeaModel.build(map, self);
    }

    public MigrateSessionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateSessionPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateSessionPackageResponse setBody(MigrateSessionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateSessionPackageResponseBody getBody() {
        return this.body;
    }

}
