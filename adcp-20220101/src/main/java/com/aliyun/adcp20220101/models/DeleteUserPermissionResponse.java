// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserPermissionResponseBody body;

    public static DeleteUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPermissionResponse self = new DeleteUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserPermissionResponse setBody(DeleteUserPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserPermissionResponseBody getBody() {
        return this.body;
    }

}
