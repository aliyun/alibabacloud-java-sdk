// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSharedAccountPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSharedAccountPermissionResponseBody body;

    public static UpdateSharedAccountPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSharedAccountPermissionResponse self = new UpdateSharedAccountPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSharedAccountPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSharedAccountPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSharedAccountPermissionResponse setBody(UpdateSharedAccountPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSharedAccountPermissionResponseBody getBody() {
        return this.body;
    }

}
