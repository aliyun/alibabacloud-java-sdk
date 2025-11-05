// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantSchemaPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantSchemaPermissionResponseBody body;

    public static GrantSchemaPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantSchemaPermissionResponse self = new GrantSchemaPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantSchemaPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantSchemaPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantSchemaPermissionResponse setBody(GrantSchemaPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantSchemaPermissionResponseBody getBody() {
        return this.body;
    }

}
