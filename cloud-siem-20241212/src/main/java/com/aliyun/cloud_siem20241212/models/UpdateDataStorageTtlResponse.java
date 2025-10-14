// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageTtlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataStorageTtlResponseBody body;

    public static UpdateDataStorageTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageTtlResponse self = new UpdateDataStorageTtlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataStorageTtlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataStorageTtlResponse setBody(UpdateDataStorageTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataStorageTtlResponseBody getBody() {
        return this.body;
    }

}
