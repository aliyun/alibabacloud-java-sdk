// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateLakeStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLakeStorageResponseBody body;

    public static UpdateLakeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLakeStorageResponse self = new UpdateLakeStorageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLakeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLakeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLakeStorageResponse setBody(UpdateLakeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLakeStorageResponseBody getBody() {
        return this.body;
    }

}
