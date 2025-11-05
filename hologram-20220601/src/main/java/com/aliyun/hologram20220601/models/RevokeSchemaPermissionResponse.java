// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeSchemaPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeSchemaPermissionResponseBody body;

    public static RevokeSchemaPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSchemaPermissionResponse self = new RevokeSchemaPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSchemaPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeSchemaPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeSchemaPermissionResponse setBody(RevokeSchemaPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSchemaPermissionResponseBody getBody() {
        return this.body;
    }

}
