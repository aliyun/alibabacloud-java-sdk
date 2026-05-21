// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListMigrationZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMigrationZonesResponseBody body;

    public static ListMigrationZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationZonesResponse self = new ListMigrationZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationZonesResponse setBody(ListMigrationZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationZonesResponseBody getBody() {
        return this.body;
    }

}
