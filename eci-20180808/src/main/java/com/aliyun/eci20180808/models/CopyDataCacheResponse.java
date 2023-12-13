// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CopyDataCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CopyDataCacheResponseBody body;

    public static CopyDataCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDataCacheResponse self = new CopyDataCacheResponse();
        return TeaModel.build(map, self);
    }

    public CopyDataCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyDataCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyDataCacheResponse setBody(CopyDataCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyDataCacheResponseBody getBody() {
        return this.body;
    }

}
