// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CheckUserPayPackPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserPayPackPermissionResponseBody body;

    public static CheckUserPayPackPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserPayPackPermissionResponse self = new CheckUserPayPackPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserPayPackPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserPayPackPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserPayPackPermissionResponse setBody(CheckUserPayPackPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserPayPackPermissionResponseBody getBody() {
        return this.body;
    }

}
