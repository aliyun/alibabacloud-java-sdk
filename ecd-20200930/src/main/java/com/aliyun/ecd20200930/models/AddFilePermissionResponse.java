// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddFilePermissionResponseBody body;

    public static AddFilePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFilePermissionResponse self = new AddFilePermissionResponse();
        return TeaModel.build(map, self);
    }

    public AddFilePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFilePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFilePermissionResponse setBody(AddFilePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFilePermissionResponseBody getBody() {
        return this.body;
    }

}
