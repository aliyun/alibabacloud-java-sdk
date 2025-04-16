// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeletePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePermissionResponseBody body;

    public static DeletePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePermissionResponse self = new DeletePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePermissionResponse setBody(DeletePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePermissionResponseBody getBody() {
        return this.body;
    }

}
