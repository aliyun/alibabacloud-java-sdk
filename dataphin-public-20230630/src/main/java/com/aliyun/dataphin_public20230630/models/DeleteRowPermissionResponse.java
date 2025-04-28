// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRowPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRowPermissionResponseBody body;

    public static DeleteRowPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowPermissionResponse self = new DeleteRowPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRowPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRowPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRowPermissionResponse setBody(DeleteRowPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRowPermissionResponseBody getBody() {
        return this.body;
    }

}
