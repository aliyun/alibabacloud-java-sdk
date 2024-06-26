// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetStorageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageListResponseBody body;

    public static GetStorageListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageListResponse self = new GetStorageListResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageListResponse setBody(GetStorageListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageListResponseBody getBody() {
        return this.body;
    }

}
