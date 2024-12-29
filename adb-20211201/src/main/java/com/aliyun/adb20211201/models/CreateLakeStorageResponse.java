// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateLakeStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLakeStorageResponseBody body;

    public static CreateLakeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeStorageResponse self = new CreateLakeStorageResponse();
        return TeaModel.build(map, self);
    }

    public CreateLakeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLakeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLakeStorageResponse setBody(CreateLakeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLakeStorageResponseBody getBody() {
        return this.body;
    }

}
