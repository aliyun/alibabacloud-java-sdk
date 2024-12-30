// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteLakeStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLakeStorageResponseBody body;

    public static DeleteLakeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakeStorageResponse self = new DeleteLakeStorageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLakeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLakeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLakeStorageResponse setBody(DeleteLakeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLakeStorageResponseBody getBody() {
        return this.body;
    }

}
