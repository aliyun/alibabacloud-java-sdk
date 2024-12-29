// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLakeStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLakeStorageResponseBody body;

    public static GetLakeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLakeStorageResponse self = new GetLakeStorageResponse();
        return TeaModel.build(map, self);
    }

    public GetLakeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLakeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLakeStorageResponse setBody(GetLakeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLakeStorageResponseBody getBody() {
        return this.body;
    }

}
