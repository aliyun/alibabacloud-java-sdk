// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateOperationPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOperationPermissionResponseBody body;

    public static UpdateOperationPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperationPermissionResponse self = new UpdateOperationPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOperationPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOperationPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOperationPermissionResponse setBody(UpdateOperationPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOperationPermissionResponseBody getBody() {
        return this.body;
    }

}
