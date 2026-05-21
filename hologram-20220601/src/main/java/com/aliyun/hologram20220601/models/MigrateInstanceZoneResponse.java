// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class MigrateInstanceZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateInstanceZoneResponseBody body;

    public static MigrateInstanceZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateInstanceZoneResponse self = new MigrateInstanceZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateInstanceZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateInstanceZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateInstanceZoneResponse setBody(MigrateInstanceZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateInstanceZoneResponseBody getBody() {
        return this.body;
    }

}
