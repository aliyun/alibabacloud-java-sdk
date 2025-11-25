// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ClearLogStoreStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearLogStoreStorageResponseBody body;

    public static ClearLogStoreStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearLogStoreStorageResponse self = new ClearLogStoreStorageResponse();
        return TeaModel.build(map, self);
    }

    public ClearLogStoreStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearLogStoreStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearLogStoreStorageResponse setBody(ClearLogStoreStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearLogStoreStorageResponseBody getBody() {
        return this.body;
    }

}
