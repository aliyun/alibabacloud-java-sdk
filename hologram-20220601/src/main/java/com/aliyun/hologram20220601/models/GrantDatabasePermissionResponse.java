// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantDatabasePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantDatabasePermissionResponseBody body;

    public static GrantDatabasePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantDatabasePermissionResponse self = new GrantDatabasePermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantDatabasePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantDatabasePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantDatabasePermissionResponse setBody(GrantDatabasePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantDatabasePermissionResponseBody getBody() {
        return this.body;
    }

}
