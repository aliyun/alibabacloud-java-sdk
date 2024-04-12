// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateDataCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataCacheResponseBody body;

    public static UpdateDataCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCacheResponse self = new UpdateDataCacheResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataCacheResponse setBody(UpdateDataCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataCacheResponseBody getBody() {
        return this.body;
    }

}
