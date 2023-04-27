// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserPermissionResponseBody body;

    public static UpdateUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPermissionResponse self = new UpdateUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserPermissionResponse setBody(UpdateUserPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserPermissionResponseBody getBody() {
        return this.body;
    }

}
