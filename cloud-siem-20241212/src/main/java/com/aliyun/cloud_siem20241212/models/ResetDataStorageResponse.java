// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ResetDataStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDataStorageResponseBody body;

    public static ResetDataStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDataStorageResponse self = new ResetDataStorageResponse();
        return TeaModel.build(map, self);
    }

    public ResetDataStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDataStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDataStorageResponse setBody(ResetDataStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDataStorageResponseBody getBody() {
        return this.body;
    }

}
