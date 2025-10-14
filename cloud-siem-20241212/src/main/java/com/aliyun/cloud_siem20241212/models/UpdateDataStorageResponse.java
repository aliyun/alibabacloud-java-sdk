// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataStorageResponseBody body;

    public static UpdateDataStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageResponse self = new UpdateDataStorageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataStorageResponse setBody(UpdateDataStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataStorageResponseBody getBody() {
        return this.body;
    }

}
