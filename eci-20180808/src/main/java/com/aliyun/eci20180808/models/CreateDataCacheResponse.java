// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateDataCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataCacheResponseBody body;

    public static CreateDataCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCacheResponse self = new CreateDataCacheResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataCacheResponse setBody(CreateDataCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataCacheResponseBody getBody() {
        return this.body;
    }

}
