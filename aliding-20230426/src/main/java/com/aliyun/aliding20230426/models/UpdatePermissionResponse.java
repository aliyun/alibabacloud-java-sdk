// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdatePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePermissionResponseBody body;

    public static UpdatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionResponse self = new UpdatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePermissionResponse setBody(UpdatePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePermissionResponseBody getBody() {
        return this.body;
    }

}
