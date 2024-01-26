// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveFilePermissionResponseBody body;

    public static RemoveFilePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFilePermissionResponse self = new RemoveFilePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFilePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFilePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveFilePermissionResponse setBody(RemoveFilePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFilePermissionResponseBody getBody() {
        return this.body;
    }

}
