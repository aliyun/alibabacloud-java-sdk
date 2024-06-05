// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ConnectDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConnectDatabaseResponseBody body;

    public static ConnectDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectDatabaseResponse self = new ConnectDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ConnectDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConnectDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConnectDatabaseResponse setBody(ConnectDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ConnectDatabaseResponseBody getBody() {
        return this.body;
    }

}
