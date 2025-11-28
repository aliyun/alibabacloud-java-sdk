// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class MigrateResourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateResourceInstanceResponseBody body;

    public static MigrateResourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceInstanceResponse self = new MigrateResourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public MigrateResourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateResourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateResourceInstanceResponse setBody(MigrateResourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateResourceInstanceResponseBody getBody() {
        return this.body;
    }

}
