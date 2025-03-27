// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheReserveSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCacheReserveSpecResponseBody body;

    public static UpdateCacheReserveSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheReserveSpecResponse self = new UpdateCacheReserveSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCacheReserveSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCacheReserveSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCacheReserveSpecResponse setBody(UpdateCacheReserveSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCacheReserveSpecResponseBody getBody() {
        return this.body;
    }

}
