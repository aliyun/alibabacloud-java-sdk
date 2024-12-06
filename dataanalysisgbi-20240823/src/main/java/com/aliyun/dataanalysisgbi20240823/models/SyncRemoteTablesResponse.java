// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class SyncRemoteTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncRemoteTablesResponseBody body;

    public static SyncRemoteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRemoteTablesResponse self = new SyncRemoteTablesResponse();
        return TeaModel.build(map, self);
    }

    public SyncRemoteTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncRemoteTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncRemoteTablesResponse setBody(SyncRemoteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncRemoteTablesResponseBody getBody() {
        return this.body;
    }

}
