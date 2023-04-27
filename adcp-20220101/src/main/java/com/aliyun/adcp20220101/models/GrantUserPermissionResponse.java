// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GrantUserPermissionResponseBody body;

    public static GrantUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionResponse self = new GrantUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantUserPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantUserPermissionResponse setBody(GrantUserPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantUserPermissionResponseBody getBody() {
        return this.body;
    }

}
