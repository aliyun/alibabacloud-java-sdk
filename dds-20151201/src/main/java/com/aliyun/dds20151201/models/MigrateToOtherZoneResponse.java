// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateToOtherZoneResponseBody body;

    public static MigrateToOtherZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneResponse self = new MigrateToOtherZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateToOtherZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateToOtherZoneResponse setBody(MigrateToOtherZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateToOtherZoneResponseBody getBody() {
        return this.body;
    }

}
