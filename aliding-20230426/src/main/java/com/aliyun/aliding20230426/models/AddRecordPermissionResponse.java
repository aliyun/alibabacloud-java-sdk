// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRecordPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecordPermissionResponseBody body;

    public static AddRecordPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecordPermissionResponse self = new AddRecordPermissionResponse();
        return TeaModel.build(map, self);
    }

    public AddRecordPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecordPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecordPermissionResponse setBody(AddRecordPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordPermissionResponseBody getBody() {
        return this.body;
    }

}
