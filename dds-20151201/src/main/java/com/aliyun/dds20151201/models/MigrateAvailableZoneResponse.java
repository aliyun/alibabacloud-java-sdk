// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateAvailableZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateAvailableZoneResponseBody body;

    public static MigrateAvailableZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateAvailableZoneResponse self = new MigrateAvailableZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateAvailableZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateAvailableZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateAvailableZoneResponse setBody(MigrateAvailableZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateAvailableZoneResponseBody getBody() {
        return this.body;
    }

}
