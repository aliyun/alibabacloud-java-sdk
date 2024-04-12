// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteDataCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataCacheResponseBody body;

    public static DeleteDataCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCacheResponse self = new DeleteDataCacheResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataCacheResponse setBody(DeleteDataCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataCacheResponseBody getBody() {
        return this.body;
    }

}
