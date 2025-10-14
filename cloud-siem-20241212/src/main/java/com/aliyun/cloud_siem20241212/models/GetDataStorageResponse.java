// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataStorageResponseBody body;

    public static GetDataStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataStorageResponse self = new GetDataStorageResponse();
        return TeaModel.build(map, self);
    }

    public GetDataStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataStorageResponse setBody(GetDataStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataStorageResponseBody getBody() {
        return this.body;
    }

}
