// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateRowPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRowPermissionResponseBody body;

    public static CreateRowPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRowPermissionResponse self = new CreateRowPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRowPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRowPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRowPermissionResponse setBody(CreateRowPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRowPermissionResponseBody getBody() {
        return this.body;
    }

}
