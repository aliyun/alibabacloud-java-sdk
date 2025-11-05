// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeDatabasePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeDatabasePermissionResponseBody body;

    public static RevokeDatabasePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeDatabasePermissionResponse self = new RevokeDatabasePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeDatabasePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeDatabasePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeDatabasePermissionResponse setBody(RevokeDatabasePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeDatabasePermissionResponseBody getBody() {
        return this.body;
    }

}
