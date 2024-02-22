// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageResponseBody body;

    public static GetStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageResponse self = new GetStorageResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageResponse setBody(GetStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageResponseBody getBody() {
        return this.body;
    }

}
