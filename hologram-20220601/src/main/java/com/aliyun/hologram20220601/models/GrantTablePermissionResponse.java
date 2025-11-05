// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantTablePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantTablePermissionResponseBody body;

    public static GrantTablePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantTablePermissionResponse self = new GrantTablePermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantTablePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantTablePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantTablePermissionResponse setBody(GrantTablePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantTablePermissionResponseBody getBody() {
        return this.body;
    }

}
