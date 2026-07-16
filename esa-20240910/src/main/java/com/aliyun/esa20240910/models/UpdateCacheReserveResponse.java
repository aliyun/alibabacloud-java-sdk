// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheReserveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCacheReserveResponseBody body;

    public static UpdateCacheReserveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheReserveResponse self = new UpdateCacheReserveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCacheReserveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCacheReserveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCacheReserveResponse setBody(UpdateCacheReserveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCacheReserveResponseBody getBody() {
        return this.body;
    }

}
