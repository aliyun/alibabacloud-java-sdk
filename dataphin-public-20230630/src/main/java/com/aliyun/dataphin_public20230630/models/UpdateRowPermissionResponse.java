// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateRowPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRowPermissionResponseBody body;

    public static UpdateRowPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRowPermissionResponse self = new UpdateRowPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRowPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRowPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRowPermissionResponse setBody(UpdateRowPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRowPermissionResponseBody getBody() {
        return this.body;
    }

}
